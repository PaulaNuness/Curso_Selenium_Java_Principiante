package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


        // Instanciar el WebDriver utilizando Chrome
        WebDriver driver = new ChromeDriver();
        try{
            // Maximizar a janela do navegador
            driver.manage().window().maximize();

            // Abrir una página web
            driver.get("https://www.google.com");

            // quiero esperar 5 segundos para ver mejor
            Thread.sleep(5000);

            // Imprimir el título de la página
            System.out.println("Page title is: " + driver.getTitle());

            //aceptar el coockie
            //escreber en la busqueda wikipedia y pulsar enter
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