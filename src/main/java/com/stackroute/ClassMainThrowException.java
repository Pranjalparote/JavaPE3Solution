package com.stackroute;

public class ClassMainThrowException
{
    ClassMainThrowException(String msg)
    {
            msg = "this Message is bounded to execute";
            System.out.println(msg);
        }

        public static void main(String[] args) throws Exception {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Inside final block");
            }

        }
    }

