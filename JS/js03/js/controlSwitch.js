let day=Number(prompt("Introduce one number from 0 to 6: "));

switch (day) {
    case 1:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
      document.write("Monday");
      break;
    case 2:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
      document.write("Tuesday");
      break;
    case 3:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
      document.write("Wednesday");
      break;
    case 4:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
      document.write("Thursday");
      break;
    case 5:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
      document.write("Friday");
      break;
    case 6:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
      document.write("Saturday");
      break;
    case 7:
      //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
      document.write("Sunday");
      break;
    default:
      //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
      document.write("That value doesn't mathc any week's day")
      break;
  }