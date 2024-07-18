package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuloB {
    public static void main(String[] args) throws InterruptedException {

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