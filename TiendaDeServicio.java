/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeservicio;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class TiendaDeServicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int compra,numDeCompras,codigoProducto=0,compraTotal=0,numProductos,puntos,eleccion,cancelarCompra,vuelto;
        System.out.println("Caja");
        System.out.println("Cuantos veces va a comprar");
        numDeCompras=sc.nextInt();
        for (int i=1;i<=numDeCompras;i++){
            System.out.println("Cuantos productos va a comprar en la compra "+i);
            numProductos=sc.nextInt();
                for (int a=1;a<=numProductos;a++){
                System.out.println("Valor producto "+a);
                compra=sc.nextInt();
                System.out.println("Ingrese codigo del producto "+a);
                codigoProducto=sc.nextInt();
                compraTotal=compraTotal+compra;
                }
            if(compraTotal<=10000){ //*Desde esta linea hasta la num 97 solo es para compras <=10000
                if((codigoProducto>=100)&&(codigoProducto<=200)){ //*De esta linea hasta la 65 con codigo producto entre 100 y 200
                    puntos=compraTotal/100;
                    System.out.println("su total de puntos es "+puntos);
                    System.out.println("El monto total es "+compraTotal);
                        System.out.println("Usted quiere realizar la compra con puntos o efectivo"
                                + " presione 1 para pagar con puntos o 2 para pagar con efectivo");
                        eleccion=sc.nextInt();
                            if(eleccion==2){
                                System.out.println("Con cuanto desea concelar");
                                cancelarCompra=sc.nextInt();
                                vuelto=cancelarCompra-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vuelto es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos);
                            }
                            if(eleccion==1){
                                puntos=puntos*100;
                                vuelto=puntos-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos/100);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vueltos es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos/100);
                                }
                }
                if((codigoProducto>200)&&(codigoProducto<=300)){ //*De esta linea hasta la 96 con codigo producto entre 100 y 200
                    puntos=compraTotal/50;
                    System.out.println("su total de puntos es "+puntos);
                    System.out.println("El monto total es "+compraTotal);
                        System.out.println("Usted quiere realizar la compra con puntos o efectivo"
                                + " presione 1 para pagar con puntos o 2 para pagar con efectivo");
                        eleccion=sc.nextInt();
                            if(eleccion==2){
                                System.out.println("Con cuanto desea concelar");
                                cancelarCompra=sc.nextInt();
                                vuelto=cancelarCompra-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vuelto es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos);
                            }
                            if(eleccion==1){
                                puntos=puntos*50;
                                vuelto=puntos-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos/50);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vueltos es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos/50);
                                }
                }
                }
            if(compraTotal>10000){ //*Desde esta linea hasta la num 63 solo es para compras <=10000
                if((codigoProducto>=100)&&(codigoProducto<=200)){ //*De esta linea hasta la 65 con codigo producto entre 100 y 200
                    puntos=compraTotal/50;
                    System.out.println("su total de puntos es "+puntos);
                    System.out.println("El monto total es "+compraTotal);
                        System.out.println("Usted quiere realizar la compra con puntos o efectivo"
                                + " presione 1 para pagar con puntos o 2 para pagar con efectivo");
                        eleccion=sc.nextInt();
                            if(eleccion==2){
                                System.out.println("Con cuanto desea concelar");
                                cancelarCompra=sc.nextInt();
                                vuelto=cancelarCompra-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vuelto es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos);
                            }
                            if(eleccion==1){
                                puntos=puntos*50;
                                vuelto=puntos-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos/50);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vueltos es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos/50);
                                }
                }
                if((codigoProducto>200)&&(codigoProducto<=300)){ //*De esta linea hasta la 96 con codigo producto entre 100 y 200
                    puntos=compraTotal/30;
                    System.out.println("su total de puntos es "+puntos);
                    System.out.println("El monto total es "+compraTotal);
                        System.out.println("Usted quiere realizar la compra con puntos o efectivo"
                                + " presione 1 para pagar con puntos o 2 para pagar con efectivo");
                        eleccion=sc.nextInt();
                            if(eleccion==2){
                                System.out.println("Con cuanto desea concelar");
                                cancelarCompra=sc.nextInt();
                                vuelto=cancelarCompra-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vuelto es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos);
                            }
                            if(eleccion==1){
                                puntos=puntos*30;
                                vuelto=puntos-compraTotal;
                                    if(vuelto==0){
                                        System.out.println("La compra total es de "+compraTotal);
                                        System.out.println("Sus puntos restantes son de "+puntos/30);
                                    }
                                System.out.println("La compra total es de "+compraTotal);
                                System.out.println("Su vueltos es de "+vuelto);
                                System.out.println("Sus puntos restantes son de "+puntos/30);
                                }
                            
                }
            }
            
            
        }
    }
        

}    
