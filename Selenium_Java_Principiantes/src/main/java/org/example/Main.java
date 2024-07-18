package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Configurar la propiedad del sistema para el ChromeDriver, hay que poner la ruta donde tenemos el executable
        System.setProperty("webdriver.chrome.driver", "./Selenium_Java_Principiantes/drivers/chromedriver.exe");
        //si ponemos en la variable de entorno no necesitamos poner la linea arriba

        // Instanciar el WebDriver utilizando Chrome
        WebDriver driver = new ChromeDriver();

        // Maximizar a janela do navegador
        driver.manage().window().maximize();

        // Abrir una página web
        driver.get("https://www.google.com");

        // queiro esperar 5 segundos para ver mejor
        Thread.sleep(5000);

        // Imprimir el título de la página
        System.out.println("Page title is: " + driver.getTitle());

        // Cerrar el navegador
        driver.quit();
    }
}