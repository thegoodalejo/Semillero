#Author: jonathan.castro@sophossolutions.com

Feature: Realizar Busqueda de producto
  Yo deseo realizar la busqueda de un producto en Amazon

  Scenario: Realizar la busqueda de producto
    Given Deseo ir a la pagina de "https://www.amazon.com/"
    When Ingreso el producto "camaras fotograficas"
    Then Valido que el producto uno con "nombre: Videocámara kimire Grabadora de cámara digital Full HD 1080P 15FPS 24MP 3.0 pulgadas Rotación de 270 grados LCD 16X Zoom digital Cámara de videocámara con 2 baterías (negro) y precio: US$ 63.99", el producto dos con "nombre: Videocámara 4K YouTube Vlogging Cámara 48MP UHD WiFi IR Visión Nocturna Videocámara 3'' 270°Rotación Pantalla Táctil 16X Zoom Digital Cámara Grabadora con Micrófono, Remoto, Estabilizador, Parasol y precio: US$ 149.99" y el producto tres con "nombre: Gemgucar - Cámara para niños con impresión de tinta cero (1080 p, cámara digital, cámara de impresión instantánea con papel de impresión, tarjeta micro SD de 16 GB, juguete portátil para niños de 3, 4, 5, 6, 7, 8 años, color azul) y precio: US$ 48.59" se encuentren en los resultados de la busqueda