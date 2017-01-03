# Spring-Boot
Creating RESTful Web Service using Spring Boot: An E-Commerce Application

## CRUD Operation on RESTful Web Services created using Spring Boot.

Before you start using make sure you have development environment is ready otherwise refer the following link [Click Here](https://github.com/dineshmadhup/Spring-Boot/wiki/Module-1:-Set-Up-a-Development-Environment). <br>
For this project, I am using Spring Tool Suite (STS) IDE. You can choose any of your choice of development environment. 


## Steps to use the application:

1. First of all download the source code and open with STS IDE. Here we can see the source code files in package explorer.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-1.png)

2. In this project there are Category and Product. The RESTful API using Spring Boot is built by considering one category will have many products. Lets test the code using tool called POSTMAN.

Right click on your main file and run with Java Application.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-2.png)

3. You will notice in console window, application has started in port 8080 of Tomcat.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-3.png)

4. Now in POSTMAN, you access the categories with URL http://localhost:8080/categories which shows empty list because no any product category is created in database.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-4.png)

### 5. Creating product category:

Using POST method, we create two product categories - Health and Auto.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-5.png)

### 6. Reading Product category:
Here we see the categories in JSON format which we created in step#5.

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-6.png)

### 7. Updating Product category using PUT method:

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-7.png)

After Update, we can see that Category name has been updated as we did:

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-8.png)

8. Delete operation using DELETE method:

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-9.png)

After Delete:

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-10.png)

### Thats it...We have verified the CRUD operation in Spring Boot.

## Lets repeat the same procedure for product.

### 1. Creating Product:
**category Id: Auto**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-11.png)

**Reading product after creation: We can see that product id: toyota has been created on category id: Auto**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-12.png)

### 2. Update Operation using PUT:

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-13.png)

**Reading after Update:**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-14.png)

3. Delete Operation using DELETE:

**Before we delete, lets read the list of product in database using following URL in POSTMAN.**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-15.png)

**Now deleting the product with product ID: toyota**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-16.png)

**After delete, we read again and can see only one product is available in database.**

![](http://mybook.scholarsu.com/wp-content/uploads/2017/01/Spring-Boot-Product-API-17.png)

Hurray....
