#Todolist </br>

**TODO List</br>**

It's a todo list project for appcent interview. In this project you can create a user and you can add your own daily job.
When you finish your daily job, you can update your todo list or you can remove it from your list. It's written using the Spring Boot framework. </br>
Todo list project runs at **8070** port.



**Technology Stack: </br>**
Java 8</br>
Spring Boot 2.6.0</br>
Spring Data</br>
Maven </br>
Swagger</br>
JUnit</br>
H2 Database</br>

</br>
</br>

**User Endpoints** </br>

![](images/swagger.png ) </br>

As you can see this is the way how to create a user. </br>

![](images/swaggeradduser.png ) </br>

Now we can see in h2 console, we create a "Test User" successfully. Also TestUser has a unique ID number which is 3. When we want to add daily job to the list, we
need that id number. </br>

![](images/h2consoleusers.png ) </br>

With userID we can add daily job. 

![](images/swaggeraddtodo.png ) </br>

We see the users todo list. When we use the "usedID" we can check the todo list.

![](images/swaggergetuser.png ) </br>

User can change the status when they finish their job.
![](images/swaggertodosuc.png ) </br>

Also we can update todo list. As you can see, The user has finished some of his daily tasks. </br>

![](images/swaggerupdate.png ) </br>

Also they can delete some of them. </br>

![](images/swaggerdeletetodo.png ) </br>

As you can see, finished jobs are gone.

![](images/swaggerupdatedtodos.png ) </br>







