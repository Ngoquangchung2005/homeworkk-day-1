package Bai6_5;

import java.util.Scanner;

public class Main6_5 {
	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Nhập bán kính của hình tròn: ");
		        double radius = scanner.nextDouble();

		        Circle circle = new Circle(radius);
		        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
		        System.out.println("Diện tích hình tròn: " + circle.getArea());

		        System.out.print("Nhập bán kính của hình tròn có thể co giãn: ");
		        double resizableRadius = scanner.nextDouble();

		        ResizableCircle resizableCircle = new ResizableCircle(resizableRadius);
		        System.out.println("Chu vi hình tròn có thể co giãn: " + resizableCircle.getPerimeter());
		        System.out.println("Diện tích hình tròn có thể co giãn: " + resizableCircle.getArea());

		        System.out.print("Nhập phần trăm co giãn (vd: 50): ");
		        double percentage = scanner.nextDouble();
		        resizableCircle.resize((int) percentage);

		        System.out.println("Chu vi sau khi co giãn " + percentage + "%: " + resizableCircle.getPerimeter());
		        System.out.println("Diện tích sau khi co giãn " + percentage + "%: " + resizableCircle.getArea());

		       
		    }
		}



