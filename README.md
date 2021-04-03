# Simple_Calculator

> This is a ReadMe file to help with the Simple_Calculator program.

---

### Table of Contents


- [Simple_Calculator](#simple_calculator)
    - [Table of Contents](#table-of-contents)
  - [Description](#description)
  - [Technologies](#technologies)
  - [How To Use](#how-to-use)
      - [Installations](#installations)
      - [Execution](#execution)
  - [Code Example and Image of the Calculator](#code-example-and-image-of-the-calculator)
  - [TroubleShooting](#troubleshooting)
  - [FAQs](#faqs)
  - [License](#license)
  - [Author Info](#author-info)

---

## Description

This is a java coded program of a very simple and easy GUI (graphical user interface) calculator. Only 2 number entry would be needed by the user, after one of the four buttons "ADD", "SUB", "MULT", or "DIV" (addition, subtraction, multiplication, and division respectively) would need to be press in order to get a calculation.

[Back To The Top](#simple_calculator)

---

## Technologies

- Eclipse Version: 2020-06 (4.16.0) 
- Java(TM) SE Development kit 14.0.1 (64-bit) Version 14.0.1.0

[Back To The Top](#simple_calculator)

---

## How To Use

#### Installations

- Java(TM) SE Development kit 14.0.1 (64-bit) Version 14.0.1.0 : [Java](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html)

- Eclipse Version: 2020-06 (4.16.0) : [Eclipse](https://www.eclipse.org/downloads/packages/release/2020-06)

- download for Simple_Calculator code : [Simple_Calculator](https://github.com/Peter92Xiong/Simple_Calculator/blob/main/Calculator.java)


#### Execution

    Run the code in Eclipse a window calculator will pop up.

![Simple Calculator](https://scontent-atl3-1.xx.fbcdn.net/v/t1.0-9/163343226_2780137468877820_875327912670682940_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=730e14&_nc_ohc=38J4l-NOG4IAX9TB-Ro&_nc_ht=scontent-atl3-1.xx&oh=776d83746eb8ce80037b06e25b508f89&oe=607D944D)

    Type any number in the first box
![Simple Calculator](https://scontent.forf1-4.fna.fbcdn.net/v/t1.6435-9/168404269_2789826037908963_5608592389988896437_n.jpg?_nc_cat=105&ccb=1-3&_nc_sid=730e14&_nc_ohc=m5KkADrksPMAX-JXyH4&_nc_ht=scontent.forf1-4.fna&oh=00de44947c5f8746fcd75360d3fd6968&oe=608D516C)

    Type any number in the second box
![Simple Calculator](https://scontent.forf1-4.fna.fbcdn.net/v/t1.6435-9/168632281_2789826044575629_8420719498225053385_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=730e14&_nc_ohc=A_gjiVUUV7gAX9PND4m&_nc_ht=scontent.forf1-4.fna&oh=7b19e44dad7a38feedd7c328d480eaa2&oe=608D259F)

    Press "ADD" "SUB" "MULT" or "DIV" (in this example MULT was pressed) to get a calculation of the 2 numbers.
![Simple Calculator](https://scontent.forf1-3.fna.fbcdn.net/v/t1.6435-9/168443649_2789826057908961_6675706400787148498_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=730e14&_nc_ohc=cxHakAJ15psAX9lb4f8&_nc_ht=scontent.forf1-3.fna&oh=a7f4f3408b852c773577f35e579c7ce7&oe=608FABB6)

[Back To The Top](#simple_calculator)

##  Code Example and Image of the Calculator

The layout of the calculator
```java
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");


```
This section is how the calculator does the calculation in the background by using the 2 numbers that was typed into the box. "n1" is the first number, "n2" is the 2nd number, and "n3" is the output of the 2 numbers. 

```java
if (opt.equals("ADD")){
        n3 = n1 + n2;
        resultLabel.setText("Result = " + n3);
    }
else if (opt.equals("SUB")){
        n3 = n1 - n2;
        resultLabel.setText("Result = " + n3);
    } 
else if (opt.equals("MULT")){
        n3 = n1 * n2;
        resultLabel.setText("Result = " + n3);
    } 
else if (opt.equals("DIV")){
    if (n2 == 0){
        resultLabel.setText("Result = Error");
    } 
    else{
        n3 = n1 / n2;
        resultLabel.setText("Result = " + n3);
    }
}
```
This section of the code catches anything that is not a number when the user types into the 2 fields. an error will populate in the result lable.
```java
        try
        {
            n1 = Double.parseDouble(txtField1.getText());
            n2 = Double.parseDouble(txtField2.getText());
        }
        catch (NumberFormatException e2)
        {
            resultLabel.setText("Result = Error");
            return;
        }

```

Image of how Simple_Calculator should look like when executed.

![Simple Calculator](https://scontent-atl3-1.xx.fbcdn.net/v/t1.0-9/163343226_2780137468877820_875327912670682940_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=730e14&_nc_ohc=38J4l-NOG4IAX9TB-Ro&_nc_ht=scontent-atl3-1.xx&oh=776d83746eb8ce80037b06e25b508f89&oe=607D944D)

[Back To The Top](#simple_calculator)
____




## TroubleShooting

 API : [Oracle_API_BorderLayout](https://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html)

 Eclipse : [Trouble shooting eclipse](https://www.eclipse.org/omr/guide/troubleshooting.html)


[Back To The Top](#simple_calculator)

---
## FAQs

- Q : Can this calculator use very large numbers?
  - A : Yes
- Q : Can this calculator use negative numbers?
  - A : Yes
- Q : Can the calculator use letters?
  - A : No, an error will show in the result.
- Q : I am having touble with "package solution;" how do i fix this.
  - A : Depending where you placed the code this line of code can differ, change this line to where you place the code for example: if you place the code in "scr" the line of code should be changed to "package src;" instead of "package solution;"

[Back To The Top](#simple_calculator)

---

## License

MIT License

Copyright (c) 2021 Peter92Xiong

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[Back To The Top](#simple_calculator)

---

## Author Info

- Linkedin - [Peter Xiong](https://www.linkedin.com/in/peter-xiong-8553a8153/)
- github - [Peter92Xiong](https://github.com/Peter92Xiong)

[Back To The Top](#simple_calculator)