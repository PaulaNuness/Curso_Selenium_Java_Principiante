package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuloA {
    public static void main(String[] args) throws InterruptedException {

        // Configurar la propiedad del sistema para el ChromeDriver, hay que poner la ruta donde tenemos el executable
        //System.setProperty("webdriver.chrome.driver", "./Selenium_Java_Principiantes/drivers/chromedriver.exe");


        //si ponemos en la variable de entorno no necesitamos poner la linea arriba,como hice:
        //variable de entorno-->path-->editar-->nuevo-->la ruta donde tengo el driver(por ejemplo:C:\Users\paula\OneDrive\Documentos\GitHub\Curso_Selenium_Java_Principiante\Selenium_Java_Principiantes\drivers)

        // Instanciar el WebDriver utilizando Chrome
        WebDriver driver = new ChromeDriver();

        // Maximizar a janela do navegador
        driver.manage().window().maximize();

        // Abrir una página web
        driver.get("https://www.google.com");

        // quiero esperar 5 segundos para ver mejor
        Thread.sleep(5000);

        // Imprimir el título de la página
        System.out.println("Page title is: " + driver.getTitle());

        // Cerrar el navegador
        driver.quit();
    }
}