# Spring-MVC-app

Simple calculator based on Spring MVC with the following result:

1) First Controller

   1.1 get parameters from url (@RequestMapping and @RequestParam annotation are used)

   1.2 does the calculation

   1.3 sends the result to the Model
   
3)  Model
   
      2.1 gets attributes (Method addAttribute() is used)
   
      2.2 sends the result to the View
   
3) View handles the result and creates an html page using Thymleaf tempalte.

The app works on the adress localhost:8080/first/calculator by adding parameters in the url.
