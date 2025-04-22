Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo en formato PDF/DOCX dentro del límite de 50 MB
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo PDF/DOCX menor a 50 MB
    Then El archivo se carga correctamente
    And Se muestra la vista previa con nombre, tamaño y tipo del archivo