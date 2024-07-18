package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


        // Instanciar el WebDriver utilizando Chrome
        WebDriver driver = new ChromeDriver();
        /***************************************************/
        try{
            // Maximizar a janela do navegador
            driver.manage().window().maximize();

           /***************************************************/

            // Abrir una página web
            driver.get("https://www.google.com");
            //tambien puedo utilizar
            //driver.navigate().to("https://www.google.com");

            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/

            // Imprimir el título de la página
            System.out.println("Page title is: " + driver.getTitle());

            /***************************************************/

            //aceptar el coockie
            driver.findElement(By.id("L2AGLb")).click();

            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/
            //escreber en la busqueda wikipedia y pulsar enter
            driver.findElement(By.name("q")).sendKeys("Wikipedia");
            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/
            

            /***************************************************/
        }catch (Exception e){
            System.out.println(e);
        }finally {
            // Cerrar el navegador que estamos trabajando
            //driver.close();

            //Cerrar todo, la session y todos los navegadores
            driver.quit();
        }

    }
}