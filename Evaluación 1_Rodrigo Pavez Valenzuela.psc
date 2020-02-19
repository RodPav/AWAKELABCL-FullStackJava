<<<<<<< HEAD

//OPCION 8
SubProceso ArregloSimple()
	
	definir n, i, j Como Entero;
	definir lista Como caracter;
	
	escribir "Ingrese cantidad de alumnos:";
	leer n;
	
	Dimension lista[n];

	
	escribir "Ingrese nombre de almunos:";
	
	para i<-0 hasta n-1 Hacer
		
		leer lista[i];
		
		
	FinPara
	
	Escribir "Lista de alumnos:";
	
	
	
	Para i<-0 hasta n-1 hacer
		
		
			
		
			
		escribir sin saltar lista[i], " - ";
			
			
		
	FinPara
	
	
=======

//OPCION 8
SubProceso ArregloSimple()
	
	definir n, i, j Como Entero;
	definir lista Como caracter;
	
	escribir "Ingrese cantidad de alumnos:";
	leer n;
	
	Dimension lista[n];

	
	escribir "Ingrese nombre de almunos:";
	
	para i<-0 hasta n-1 Hacer
		
		leer lista[i];
		
		
	FinPara
	
	Escribir "Lista de alumnos:";
	
	
	
	Para i<-0 hasta n-1 hacer
		
		
			
		
			
		escribir sin saltar lista[i], " - ";
			
			
		
	FinPara
	
	
>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
	
	
FinSubProceso

<<<<<<< HEAD
//OPCION 7
SubProceso RepetitivaPara()
	
	definir i Como Entero;
	definir nombre Como Caracter;
	definir nom, nomrep Como Caracter;
	dimension nom[10];
	
	// variable para contar repetidos
	definir contrep como entero;
	
	Escribir "Ingrese el nombre de 10 personas por favor:";
	

	Para i<-0 hasta 9 Hacer
		
		
		leer nom[i];
		
	FinPara
	
	contrep<-0;
	nombre<-"";
	
	Para i<-0 hasta 9 Hacer
		
		
		//contar nombres repetidos y estos guardarlos en una variable
		si nom[i]=nombre entonces
			
			contrep<-contrep+1;
			nomrep<-nom[i];
			
		FinSi
		
		nombre<-nom[i];

		
	FinPara
	
	
	//mostrar si hay o no nombres repetidos
	
	//no me resulto mostrar todos lo sque se repiten, solo muestra el ultimo repetido
	
	si contrep>1 entonces
		
		Escribir "Nombre Repetido: ", nomrep;
		
	SiNo
		
		si contrep=0 Entonces
			
			Escribir "No existen nombres repetidos";
			
		FinSi
		
	FinSi

	

	

	
	
	
FinSubProceso




//OPCION 6
SubProceso RepetitivaRepetir()
	
	definir nom como caracter;
	definir cont como entero;
	cont<-0;
	
	escribir "Ingrese cuantos nombres desee que comiencen con J:";
	
	Repetir
		
		leer nom;
		nom<-Mayusculas(nom);
		cont<-cont+1;
		
	Hasta Que nom="JUAN"
	
	escribir "Ganaste";
	Escribir "Cantidad de intentos ", cont-1;
	
	
	
FinSubProceso

//OPCION 5
SubProceso RepetitivaMientras()
	
	definir cont,suma, num como enteros;
	definir prom Como Real;
	cont<-0;
	num<-1;
	suma<-1;
	prom<-0;
	
	Escribir "Ingrese números:";
	
	
	Mientras num<>0 Hacer
		
		leer num;
		
		si num<>0 entonces
			
			cont<-cont+1;
			
			suma<-suma+num;
			
		FinSi
		
		
		
	FinMientras
	
	prom<-suma/cont;
	
	escribir "Cantidad de numeros ingresados: ", cont;
	escribir "Promedio es: ", prom;
	
FinSubProceso

//OPCION 4
SubProceso CondicionalSegun()
	
	definir num, op como entero;
	definir text como caracter;
	
	escribir "Ingrese un numero del 1 al 10:";
	leer op;
	
	//no me funcionó ConvertirATexto
	Segun op Hacer
		1:
			
=======
//OPCION 7
SubProceso RepetitivaPara()
	
	definir i Como Entero;
	definir nombre Como Caracter;
	definir nom, nomrep Como Caracter;
	dimension nom[10];
	
	// variable para contar repetidos
	definir contrep como entero;
	
	Escribir "Ingrese el nombre de 10 personas por favor:";
	

	Para i<-0 hasta 9 Hacer
		
		
		leer nom[i];
		
	FinPara
	
	contrep<-0;
	nombre<-"";
	
	Para i<-0 hasta 9 Hacer
		
		
		//contar nombres repetidos y estos guardarlos en una variable
		si nom[i]=nombre entonces
			
			contrep<-contrep+1;
			nomrep<-nom[i];
			
		FinSi
		
		nombre<-nom[i];

		
	FinPara
	
	
	//mostrar si hay o no nombres repetidos
	
	//no me resulto mostrar todos lo sque se repiten, solo muestra el ultimo repetido
	
	si contrep>1 entonces
		
		Escribir "Nombre Repetido: ", nomrep;
		
	SiNo
		
		si contrep=0 Entonces
			
			Escribir "No existen nombres repetidos";
			
		FinSi
		
	FinSi

	

	

	
	
	
FinSubProceso




//OPCION 6
SubProceso RepetitivaRepetir()
	
	definir nom como caracter;
	definir cont como entero;
	cont<-0;
	
	escribir "Ingrese cuantos nombres desee que comiencen con J:";
	
	Repetir
		
		leer nom;
		nom<-Mayusculas(nom);
		cont<-cont+1;
		
	Hasta Que nom="JUAN"
	
	escribir "Ganaste";
	Escribir "Cantidad de intentos ", cont-1;
	
	
	
FinSubProceso

//OPCION 5
SubProceso RepetitivaMientras()
	
	definir cont,suma, num como enteros;
	definir prom Como Real;
	cont<-0;
	num<-1;
	suma<-1;
	prom<-0;
	
	Escribir "Ingrese números:";
	
	
	Mientras num<>0 Hacer
		
		leer num;
		
		si num<>0 entonces
			
			cont<-cont+1;
			
			suma<-suma+num;
			
		FinSi
		
		
		
	FinMientras
	
	prom<-suma/cont;
	
	escribir "Cantidad de numeros ingresados: ", cont;
	escribir "Promedio es: ", prom;
	
FinSubProceso

//OPCION 4
SubProceso CondicionalSegun()
	
	definir num, op como entero;
	definir text como caracter;
	
	escribir "Ingrese un numero del 1 al 10:";
	leer op;
	
	//no me funcionó ConvertirATexto
	Segun op Hacer
		1:
			
>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
			Escribir "Numero en Palabra: ", "UNO";
		2:
			Escribir "Numero en Palabra: ", "DOS";
		3:
<<<<<<< HEAD
			Escribir "Numero en Palabra: ", "TRES";
			
		4:
			Escribir "Numero en Palabra: ", "CUATRO";
		5:
			Escribir "Numero en Palabra: ", "CINCO";
		6:
			Escribir "Numero en Palabra: ", "SEIS";
		7:
			Escribir "Numero en Palabra: ", "SIETE";
		8:
			Escribir "Numero en Palabra: ", "OCHO";
		9:
			Escribir "Numero en Palabra: ", "NUEVE";
			
		10:
			
			Escribir "Numero en Palabra: ", "DIEZ";
			
		De Otro Modo:
			
=======
			Escribir "Numero en Palabra: ", "TRES";
			
		4:
			Escribir "Numero en Palabra: ", "CUATRO";
		5:
			Escribir "Numero en Palabra: ", "CINCO";
		6:
			Escribir "Numero en Palabra: ", "SEIS";
		7:
			Escribir "Numero en Palabra: ", "SIETE";
		8:
			Escribir "Numero en Palabra: ", "OCHO";
		9:
			Escribir "Numero en Palabra: ", "NUEVE";
			
		10:
			
			Escribir "Numero en Palabra: ", "DIEZ";
			
		De Otro Modo:
			
>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
			Escribir "SOLO SE PERMITEN NUMEROS DEL 1 AL 10";
			
	FinSegun
	
FinSubProceso

<<<<<<< HEAD

//OPCION 3
SubProceso  CondicionalSiEntoncesAnidado()
	
	definir nom, gen, tipo Como Caracter;
	
	escribir "Ingrese nombre y género de la persona:";
	leer nom;
	leer gen;
	
	
	si gen="hombre" entonces
		
		escribir "Derivado a baño de Hombres";
		escribir "";
		escribir "Desea utilizar ducha o baño?";
		
		leer tipo;
		
		si tipo="ducha" Entonces
			
			Escribir "Debe pagar $2500";
			
		SiNo
			
			Escribir "Debe pagar $250";
			
			
		FinSi
		
	SiNo
		
		escribir "Derivado a baño de Mujeres";
		escribir "";
		escribir "Desea utilizar ducha o baño?";
		
		leer tipo;
		
		si tipo="ducha" Entonces
			
			Escribir "Debe pagar $2500";
			
		SiNo
			
			Escribir "Debe pagar $250";
			
			
		FinSi
		
		
	FinSi
	
	
FinSubProceso

//OPCION 2

SubProceso CondicionSiEntonces()
	
	definir nom, gen Como Caracter;
	
	escribir "Ingrese nombre y género de la persona:";
	leer nom;
	leer gen;
		
	
	si gen="hombre" entonces
		
		escribir "Derivado a baño de Hombres";
		
	SiNo
		
		escribir "Derivado a baño de Mujeres";
		
=======

//OPCION 3
SubProceso  CondicionalSiEntoncesAnidado()
	
	definir nom, gen, tipo Como Caracter;
	
	escribir "Ingrese nombre y género de la persona:";
	leer nom;
	leer gen;
	
	
	si gen="hombre" entonces
		
		escribir "Derivado a baño de Hombres";
		escribir "";
		escribir "Desea utilizar ducha o baño?";
		
		leer tipo;
		
		si tipo="ducha" Entonces
			
			Escribir "Debe pagar $2500";
			
		SiNo
			
			Escribir "Debe pagar $250";
			
			
		FinSi
		
	SiNo
		
		escribir "Derivado a baño de Mujeres";
		escribir "";
		escribir "Desea utilizar ducha o baño?";
		
		leer tipo;
		
		si tipo="ducha" Entonces
			
			Escribir "Debe pagar $2500";
			
		SiNo
			
			Escribir "Debe pagar $250";
			
			
		FinSi
		
		
	FinSi
	
	
FinSubProceso

//OPCION 2

SubProceso CondicionSiEntonces()
	
	definir nom, gen Como Caracter;
	
	escribir "Ingrese nombre y género de la persona:";
	leer nom;
	leer gen;
		
	
	si gen="hombre" entonces
		
		escribir "Derivado a baño de Hombres";
		
	SiNo
		
		escribir "Derivado a baño de Mujeres";
		
>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
	FinSi
	
	
FinSubProceso
<<<<<<< HEAD

//OPCION 1
SubProceso  Secuencial ()
	
	definir n1, n2, n3 Como Entero;
	Definir prom Como Real;
	
	escribir "Ingrese 3 números";
	leer n1;
	leer n2;
	leer n3;
	
	escribir "Promedio es: ", (n1+n2+n3)/3;
	
FinSubProceso


//PROCESO PRINCIPAL
Proceso sin_titulo
	
	definir op como entero;
	
	Repetir
		
		escribir "MENU";
		escribir "--------";
		escribir "1.Secuencial:";
		escribir "2.Condicional Si entonces:";
		escribir "3.Condicional Si entonces anidado:";
		escribir "5.Repetitiva Mientras";
		escribir "6.Repetitiva Repetir";
		escribir "7.repetitiva Para";
		escribir "8.Arreglo Simple";
		escribir "9.Arreglo Bidimensional";
		escribir "10.Salir";
		escribir "";
		
		escribir "Seleccione opción";
		leer op;
		
		Segun op Hacer
=======

//OPCION 1
SubProceso  Secuencial ()
	
	definir n1, n2, n3 Como Entero;
	Definir prom Como Real;
	
	escribir "Ingrese 3 números";
	leer n1;
	leer n2;
	leer n3;
	
	escribir "Promedio es: ", (n1+n2+n3)/3;
	
FinSubProceso


//PROCESO PRINCIPAL
Proceso sin_titulo
	
	definir op como entero;
	
	Repetir
		
		escribir "MENU";
		escribir "--------";
		escribir "1.Secuencial:";
		escribir "2.Condicional Si entonces:";
		escribir "3.Condicional Si entonces anidado:";
		escribir "5.Repetitiva Mientras";
		escribir "6.Repetitiva Repetir";
		escribir "7.repetitiva Para";
		escribir "8.Arreglo Simple";
		escribir "9.Arreglo Bidimensional";
		escribir "10.Salir";
		escribir "";
		
		escribir "Seleccione opción";
		leer op;
		
		Segun op Hacer
>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
			1:
				Secuencial();
			2:
				CondicionSiEntonces();
			3:
<<<<<<< HEAD
				
				CondicionalSiEntoncesAnidado();
			4:
				
				CondicionalSegun();
				
			5:
				RepetitivaMientras();
				
			6:
				RepetitivaRepetir();
				
			7:
				RepetitivaPara();
				
			8:
				ArregloSimple();
				
			
			De Otro Modo:
//				secuencia_de_acciones_dom
		FinSegun
		
	Hasta Que op>0 y op<11
	
	
	

FinProceso



=======
				
				CondicionalSiEntoncesAnidado();
			4:
				
				CondicionalSegun();
				
			5:
				RepetitivaMientras();
				
			6:
				RepetitivaRepetir();
				
			7:
				RepetitivaPara();
				
			8:
				ArregloSimple();
				
			
			De Otro Modo:
//				secuencia_de_acciones_dom
		FinSegun
		
	Hasta Que op>0 y op<11
	
	
	

FinProceso



>>>>>>> 36022629f2d537b850176e22e185c3a64f985797
