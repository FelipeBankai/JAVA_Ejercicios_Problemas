package rallydakar;

import java.util.Scanner;


public class RallyDakar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rally");
        int tramo;
        
        int horasCorredor1, minutosCorredor1, segundosCorredor1;
        int acumulador1=0;
        int acumHoras1, acumMinutos1, acumSegundos1;
        
        int horasCorredor2, minutosCorredor2, segundosCorredor2;
        int acumulador2=0;
        int acumHoras2, acumMinutos2, acumSegundos2;
        
        int horasCorredor3, minutosCorredor3, segundosCorredor3;
        int acumulador3=0;
        int acumHoras3, acumMinutos3, acumSegundos3;
        
        int horasCorredor4, minutosCorredor4, segundosCorredor4;
        int acumulador4=0;
        int acumHoras4, acumMinutos4, acumSegundos4;
        
        int horasCorredor5, minutosCorredor5, segundosCorredor5;
        int acumulador5=0;
        int acumHoras5, acumMinutos5, acumSegundos5;
        
        int horasCorredor6, minutosCorredor6, segundosCorredor6;
        int acumulador6=0;
        int acumHoras6, acumMinutos6, acumSegundos6;
        
        int horasCorredor7, minutosCorredor7, segundosCorredor7;
        int acumulador7=0;
        int acumHoras7, acumMinutos7, acumSegundos7;
        
        int horasCorredor8, minutosCorredor8, segundosCorredor8;
        int acumulador8=0;
        int acumHoras8, acumMinutos8, acumSegundos8;
        
        int horasCorredor9, minutosCorredor9, segundosCorredor9;
        int acumulador9=0;
        int acumHoras9, acumMinutos9, acumSegundos9;
        
        int horasCorredor10, minutosCorredor10, segundosCorredor10;
        int acumulador10=0;
        int acumHoras10, acumMinutos10, acumSegundos10;
        
        for(int i=1;i<=5;i++){
            System.out.println("Etapa "+i);
            System.out.println("Ingrese los tramos a recorrer hoy");
            tramo=sc.nextInt();
            
                for(int a=1;a<=tramo;a++){
                    System.out.println("Tiempo que demoro el corredor 1");//corredor 1
                    System.out.println("Indique en horas");
                    horasCorredor1=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor1=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor1=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor1+":"+minutosCorredor1+":"+segundosCorredor1);
                    acumulador1=(horasCorredor1*3600)+(minutosCorredor1*60)+segundosCorredor1+acumulador1;
                    acumHoras1=acumulador1/3600;
                    acumMinutos1=(acumulador1-(3600*acumHoras1))/60;
                    acumSegundos1=acumulador1-((acumHoras1*3600)+(acumMinutos1*60));
                    System.out.println("Tiempo total es "+acumHoras1+":"+acumMinutos1+":"+acumSegundos1);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 2");//corredor 2
                    System.out.println("Indique en horas");
                    horasCorredor2=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor2=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor2=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor2+":"+minutosCorredor2+":"+segundosCorredor2);
                    acumulador2=(horasCorredor2*3600)+(minutosCorredor2*60)+segundosCorredor2+acumulador2;
                    acumHoras2=acumulador2/3600;
                    acumMinutos2=(acumulador2-(3600*acumHoras2))/60;
                    acumSegundos2=acumulador2-((acumHoras2*3600)+(acumMinutos2*60));
                    System.out.println("Tiempo total es "+acumHoras2+":"+acumMinutos2+":"+acumSegundos2);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 3");//corredor 3
                    System.out.println("Indique en horas");
                    horasCorredor3=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor3=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor3=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor3+":"+minutosCorredor3+":"+segundosCorredor3);
                    acumulador3=(horasCorredor3*3600)+(minutosCorredor3*60)+segundosCorredor3+acumulador3;
                    acumHoras3=acumulador3/3600;
                    acumMinutos3=(acumulador3-(3600*acumHoras3))/60;
                    acumSegundos3=acumulador3-((acumHoras3*3600)+(acumMinutos3*60));
                    System.out.println("Tiempo total es "+acumHoras3+":"+acumMinutos3+":"+acumSegundos3);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 4");//corredor 4
                    System.out.println("Indique en horas");
                    horasCorredor4=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor4=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor4=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor4+":"+minutosCorredor4+":"+segundosCorredor4);
                    acumulador4=(horasCorredor4*3600)+(minutosCorredor4*60)+segundosCorredor4+acumulador4;
                    acumHoras4=acumulador4/3600;
                    acumMinutos4=(acumulador4-(3600*acumHoras4))/60;
                    acumSegundos4=acumulador4-((acumHoras4*3600)+(acumMinutos4*60));
                    System.out.println("Tiempo total es "+acumHoras4+":"+acumMinutos4+":"+acumSegundos4);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 5");//corredor 5
                    System.out.println("Indique en horas");
                    horasCorredor5=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor5=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor5=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor5+":"+minutosCorredor5+":"+segundosCorredor5);
                    acumulador5=(horasCorredor5*3600)+(minutosCorredor5*60)+segundosCorredor5+acumulador5;
                    acumHoras5=acumulador5/3600;
                    acumMinutos5=(acumulador5-(3600*acumHoras5))/60;
                    acumSegundos5=acumulador5-((acumHoras5*3600)+(acumMinutos5*60));
                    System.out.println("Tiempo total es "+acumHoras5+":"+acumMinutos5+":"+acumSegundos5);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 6");//corredor 6
                    System.out.println("Indique en horas");
                    horasCorredor6=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor6=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor6=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor6+":"+minutosCorredor6+":"+segundosCorredor6);
                    acumulador6=(horasCorredor6*3600)+(minutosCorredor6*60)+segundosCorredor6+acumulador6;
                    acumHoras6=acumulador6/3600;
                    acumMinutos6=(acumulador6-(3600*acumHoras6))/60;
                    acumSegundos6=acumulador6-((acumHoras6*3600)+(acumMinutos6*60));
                    System.out.println("Tiempo total es "+acumHoras6+":"+acumMinutos6+":"+acumSegundos6);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 7");//corredor 7
                    System.out.println("Indique en horas");
                    horasCorredor7=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor7=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor7=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor7+":"+minutosCorredor7+":"+segundosCorredor7);
                    acumulador7=(horasCorredor7*3600)+(minutosCorredor7*60)+segundosCorredor7+acumulador7;
                    acumHoras7=acumulador7/3600;
                    acumMinutos7=(acumulador7-(3600*acumHoras7))/60;
                    acumSegundos7=acumulador7-((acumHoras7*3600)+(acumMinutos7*60));
                    System.out.println("Tiempo total es "+acumHoras7+":"+acumMinutos7+":"+acumSegundos7);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 8");//corredor 8
                    System.out.println("Indique en horas");
                    horasCorredor8=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor8=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor8=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor8+":"+minutosCorredor8+":"+segundosCorredor8);
                    acumulador8=(horasCorredor8*3600)+(minutosCorredor8*60)+segundosCorredor8+acumulador8;
                    acumHoras8=acumulador8/3600;
                    acumMinutos8=(acumulador8-(3600*acumHoras8))/60;
                    acumSegundos8=acumulador8-((acumHoras8*3600)+(acumMinutos8*60));
                    System.out.println("Tiempo total es "+acumHoras8+":"+acumMinutos8+":"+acumSegundos8);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 9");//corredor 9
                    System.out.println("Indique en horas");
                    horasCorredor9=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor9=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor9=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor9+":"+minutosCorredor9+":"+segundosCorredor9);
                    acumulador9=(horasCorredor9*3600)+(minutosCorredor9*60)+segundosCorredor9+acumulador9;
                    acumHoras9=acumulador9/3600;
                    acumMinutos9=(acumulador9-(3600*acumHoras9))/60;
                    acumSegundos9=acumulador9-((acumHoras9*3600)+(acumMinutos9*60));
                    System.out.println("Tiempo total es "+acumHoras9+":"+acumMinutos9+":"+acumSegundos9);
                    
                    
                    System.out.println("Tiempo que demoro el corredor 10");//corredor 10
                    System.out.println("Indique en horas");
                    horasCorredor10=sc.nextInt();
                    System.out.println("Indique en minutos");
                    minutosCorredor10=sc.nextInt();
                    System.out.println("Indique en segundos");
                    segundosCorredor10=sc.nextInt();
                    System.out.println("tiempo estimado es "+horasCorredor10+":"+minutosCorredor10+":"+segundosCorredor10);
                    acumulador10=(horasCorredor10*3600)+(minutosCorredor10*60)+segundosCorredor10+acumulador10;
                    acumHoras10=acumulador10/3600;
                    acumMinutos10=(acumulador10-(3600*acumHoras10))/60;
                    acumSegundos10=acumulador10-((acumHoras10*3600)+(acumMinutos10*60));
                    System.out.println("Tiempo total es "+acumHoras10+":"+acumMinutos10+":"+acumSegundos10);
                    
                     
                }//fin de las etapas
            if(acumulador1<acumulador2 && acumulador1<acumulador3 && acumulador1<acumulador4 && acumulador1<acumulador5 && acumulador1<acumulador6 && acumulador1<acumulador7 && acumulador1<acumulador8 && acumulador1<acumulador9 && acumulador1<acumulador10){
                System.out.println("Corredor 1 a ganado etapa "+i);
            }
            if(acumulador2<acumulador1 && acumulador2<acumulador3 && acumulador2<acumulador4 && acumulador2<acumulador5 && acumulador2<acumulador6 && acumulador2<acumulador7 && acumulador2<acumulador8 && acumulador2<acumulador9 && acumulador2<acumulador10){
                System.out.println("Corredor 2 a ganado etapa "+i);
            }
            if(acumulador3<acumulador2 && acumulador3<acumulador1 && acumulador3<acumulador4 && acumulador3<acumulador5 && acumulador3<acumulador6 && acumulador3<acumulador7 && acumulador3<acumulador8 && acumulador3<acumulador9 && acumulador3<acumulador10){
                System.out.println("Corredor 3 a ganado etapa "+i);
            }
            if(acumulador4<acumulador2 && acumulador4<acumulador3 && acumulador4<acumulador1 && acumulador4<acumulador5 && acumulador4<acumulador6 && acumulador4<acumulador7 && acumulador4<acumulador8 && acumulador4<acumulador9 && acumulador4<acumulador10){
                System.out.println("Corredor 4 a ganado etapa "+i);
            }
            if(acumulador5<acumulador2 && acumulador5<acumulador3 && acumulador5<acumulador4 && acumulador5<acumulador1 && acumulador5<acumulador6 && acumulador5<acumulador7 && acumulador5<acumulador8 && acumulador5<acumulador9 && acumulador5<acumulador10){
                System.out.println("Corredor 5 a ganado etapa "+i);
            }
            if(acumulador6<acumulador2 && acumulador6<acumulador3 && acumulador6<acumulador4 && acumulador6<acumulador5 && acumulador6<acumulador1 && acumulador6<acumulador7 && acumulador6<acumulador8 && acumulador6<acumulador9 && acumulador6<acumulador10){
                System.out.println("Corredor 6 a ganado etapa "+i);
            }
            if(acumulador7<acumulador2 && acumulador7<acumulador3 && acumulador7<acumulador4 && acumulador7<acumulador5 && acumulador7<acumulador6 && acumulador7<acumulador1 && acumulador7<acumulador8 && acumulador7<acumulador9 && acumulador7<acumulador10){
                System.out.println("Corredor 7 a ganado etapa "+i);
            }
            if(acumulador8<acumulador2 && acumulador8<acumulador3 && acumulador8<acumulador4 && acumulador8<acumulador5 && acumulador8<acumulador6 && acumulador8<acumulador7 && acumulador8<acumulador1 && acumulador8<acumulador9 && acumulador8<acumulador10){
                System.out.println("Corredor 8 a ganado etapa "+i);
            }
            if(acumulador9<acumulador2 && acumulador9<acumulador3 && acumulador9<acumulador4 && acumulador9<acumulador5 && acumulador9<acumulador6 && acumulador9<acumulador7 && acumulador9<acumulador8 && acumulador9<acumulador1 && acumulador9<acumulador10){
                System.out.println("Corredor 9 a ganado etapa "+i);
            }
            if(acumulador10<acumulador2 && acumulador10<acumulador3 && acumulador10<acumulador4 && acumulador10<acumulador5 && acumulador10<acumulador6 && acumulador10<acumulador7 && acumulador10<acumulador8 && acumulador10<acumulador9 && acumulador10<acumulador1){
                System.out.println("Corredor 10 a ganado etapa "+i);
            }
        }//fin de las etapas    
    if(acumulador1<acumulador2 && acumulador1<acumulador3 && acumulador1<acumulador4 && acumulador1<acumulador5 && acumulador1<acumulador6 && acumulador1<acumulador7 && acumulador1<acumulador8 && acumulador1<acumulador9 && acumulador1<acumulador10){
                System.out.println("Corredor 1 a ganado");
            }
            if(acumulador2<acumulador1 && acumulador2<acumulador3 && acumulador2<acumulador4 && acumulador2<acumulador5 && acumulador2<acumulador6 && acumulador2<acumulador7 && acumulador2<acumulador8 && acumulador2<acumulador9 && acumulador2<acumulador10){
                System.out.println("Corredor 2 a ganado");
            }
            if(acumulador3<acumulador2 && acumulador3<acumulador1 && acumulador3<acumulador4 && acumulador3<acumulador5 && acumulador3<acumulador6 && acumulador3<acumulador7 && acumulador3<acumulador8 && acumulador3<acumulador9 && acumulador3<acumulador10){
                System.out.println("Corredor 3 a ganado");
            }
            if(acumulador4<acumulador2 && acumulador4<acumulador3 && acumulador4<acumulador1 && acumulador4<acumulador5 && acumulador4<acumulador6 && acumulador4<acumulador7 && acumulador4<acumulador8 && acumulador4<acumulador9 && acumulador4<acumulador10){
                System.out.println("Corredor 4 a ganado");
            }
            if(acumulador5<acumulador2 && acumulador5<acumulador3 && acumulador5<acumulador4 && acumulador5<acumulador1 && acumulador5<acumulador6 && acumulador5<acumulador7 && acumulador5<acumulador8 && acumulador5<acumulador9 && acumulador5<acumulador10){
                System.out.println("Corredor 5 a ganado");
            }
            if(acumulador6<acumulador2 && acumulador6<acumulador3 && acumulador6<acumulador4 && acumulador6<acumulador5 && acumulador6<acumulador1 && acumulador6<acumulador7 && acumulador6<acumulador8 && acumulador6<acumulador9 && acumulador6<acumulador10){
                System.out.println("Corredor 6 a ganado");
            }
            if(acumulador7<acumulador2 && acumulador7<acumulador3 && acumulador7<acumulador4 && acumulador7<acumulador5 && acumulador7<acumulador6 && acumulador7<acumulador1 && acumulador7<acumulador8 && acumulador7<acumulador9 && acumulador7<acumulador10){
                System.out.println("Corredor 7 a ganado");
            }
            if(acumulador8<acumulador2 && acumulador8<acumulador3 && acumulador8<acumulador4 && acumulador8<acumulador5 && acumulador8<acumulador6 && acumulador8<acumulador7 && acumulador8<acumulador1 && acumulador8<acumulador9 && acumulador8<acumulador10){
                System.out.println("Corredor 8 a ganado");
            }
            if(acumulador9<acumulador2 && acumulador9<acumulador3 && acumulador9<acumulador4 && acumulador9<acumulador5 && acumulador9<acumulador6 && acumulador9<acumulador7 && acumulador9<acumulador8 && acumulador9<acumulador1 && acumulador9<acumulador10){
                System.out.println("Corredor 9 a ganado");
            }
            if(acumulador10<acumulador2 && acumulador10<acumulador3 && acumulador10<acumulador4 && acumulador10<acumulador5 && acumulador10<acumulador6 && acumulador10<acumulador7 && acumulador10<acumulador8 && acumulador10<acumulador9 && acumulador10<acumulador1){
                System.out.println("Corredor 10 a ganado");
            }
              
    }
    
}
