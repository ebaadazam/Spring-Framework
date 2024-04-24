<h4>ModelAndView</h4>
ModelAndView is an object that holds both the model data and the view information in a single return value. It allows a controller to return both model (data) and view (page) in one return value. We have used it in place of session. Its job is to store the value in a separate variable and sends it to another page (more like a jsp page).<br>

<h4>Model and ModelMap</h4>
We can also use Model or ModelMap instead of ModelAndView. Whenever you want to call a view and send the data to the client, the client expects an html page. So we created jsp which will get converted into html after rendering. <br>

<h4>Model</h4>
Model is just an interface which behaves same as ModelAndView. In Model, we use addAttribute() method with it. When you send a request and you want that data in a model, then you should use Model but both works(ModelMap).<br>

<h4>ModelMap</h4>
ModelMap supports features of map. Bydefault when you add the attribute, it will get added in a map format which will be added to the model object. But if you want to add a simple object not a map format object then simply go for Model
