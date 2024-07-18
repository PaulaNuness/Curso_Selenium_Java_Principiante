package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebElement busqueda_google;
        WebElement link_wikipedia;

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

            //escreber en la busqueda wikipedia
            busqueda_google = driver.findElement(By.name("q"));
            busqueda_google.sendKeys("Wikipedia");
            //driver.findElement(By.name("q")).sendKeys("Wikipedia"); tambien puedo hacer así

            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/

            //Pulsar Enter
            busqueda_google.sendKeys(Keys.RETURN);
            //busqueda_google.sendKeys(Keys.ENTER);tambien puedo hacer así

            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/

            //Escribir por pantalla el titulo de la pagina
            System.out.println("Page title is: " + driver.getTitle());

            /***************************************************/

            //pulsar no primero no enlace para entrar en wikipedia
            // Encontrar y pulsar el enlace "Wikipedia"
            link_wikipedia = driver.findElement(By.cssSelector("a[href='https://es.wikipedia.org/wiki/Wikipedia:Portada']"));
            link_wikipedia.click();

            /***************************************************/

            // quiero esperar 3 segundos para ver mejor
            Thread.sleep(3000);

            /***************************************************/

            //Escribir por pantalla el titulo de la pagina
            System.out.println("Page title is: " + driver.getTitle());

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