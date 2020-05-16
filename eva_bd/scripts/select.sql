--Conocer el número de evaluaciones por curso

select c.id_curso, c.descripcion, count (id_test) from test t
left join pregunta p
on t.id_test=p.test_id_test
join alternativa alt
on p.id_pregunta=alt.pregunta_id_pregunta
join alumno a
on alt.alumno_rut=a.rut
join curso c
on a.curso_id_curso=c.id_curso 
group by c.id_curso, c.descripcion;
