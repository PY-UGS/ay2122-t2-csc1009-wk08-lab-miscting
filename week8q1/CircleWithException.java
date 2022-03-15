package week8q1;

import java.util.Scanner;

public class CircleWithException {
        private double radius;
        
        public CircleWithException() {}

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            }
            else {
                throw new IllegalArgumentException("Radius must not be negative");
                //System.out.println("Radius must not be negative");
            }
        }

        public double getArea() throws Exception {
            double area = this.radius * this.radius * Math.PI;
            if (area <= 1000) {
                return area;
            }
            else {
                throw new Exception("Area larger than 1000");
            }
        }

        public double getDiameter() {
            double diameter = Math.PI * 2 * (this.radius);
            return diameter;
        }

        public static void main(String args[]) throws Exception {
            boolean loop = false;
            Scanner input = new Scanner(System.in);
            CircleWithException Circle1 = new CircleWithException();
            while (loop == false) {
                try {
                    System.out.print("Enter radius: ");
                    Circle1.setRadius(input.nextDouble());
                    loop = true;
                }
                catch (IllegalArgumentException ee) {
                    System.out.println(ee.getMessage());
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
 
            }
            System.out.println("Circle1's area is: " + Circle1.getArea());
            input.close();
        }


}
