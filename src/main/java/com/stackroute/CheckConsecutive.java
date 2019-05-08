package com.stackroute;
public class CheckConsecutive
{
boolean result=false;
//Function checknumber cheks given input is consecutive integer or not
            public boolean checkNumber(String values)
            {
                String[] array = values.split(",");     //split entered string from  comma
                for (int i = 0; i < array.length - 1; i++) {   //Loop to vary till end of entered input
                    int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);   //calculate difference and store in variable
                    System.out.println(difference);             //print difference
                    if (difference == 1 || difference == -1) {  //check difference is 1 or -1
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
                return result;         //return boolean value of result
            }
}




