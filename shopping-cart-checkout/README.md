# shopping-cart-checkout
A Java command line interface (CLI) application that accepts a list of commodities [Apple and Orange], calculates the total, and prints all the items in the shopping cart and teh total price.

## Build and run as the stand-alone Java CLI application
The application is run as stand-alone Java CLI application and requires the following:
- JDK 1.8 or higher
- Maven 3.5.3 or higher

Follow the below instructions to download, build and run the Java CLI application:
- Download and unzip the source repository for this guide, or clone it using Git
- Change directory into code-samples-2019-master/shopping-cart-checkout
- Build and run the Java CLI application using: mvn clean install && java -jar target/shopping-cart-checkout.jar

After the above step (Build and run), the Java CLI application should be up and running and ready to receive user inputs via the command line with the below command prompt:
Type 0=Add Apple to shopping cart, 1=Add Orange to shopping cart, C=Checkout, X=Exit the program. Hit the [ENTER] key to submit each option.