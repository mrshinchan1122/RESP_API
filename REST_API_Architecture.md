# What is REST API?
REST(REpresntational State Transfer) is an architecural style used to design web services. RESTful APIs allow different systems (like your java app and a remote server) to commuicate over HTTP.


# Key Components of REST API Architeture
## Component
Client:
    - The Application that sends the request<br>
Server:
    - The application that handles the request and sends back a response<br>
Resources:
    - Data entities like users, products, etc.. identified by URLs.<br>
HTTP Methods:
    - Actions performed on resources (GET, POST, PUT, DELETE)<br>
Stateless: 
    - Every request from client to server must contain all the information needed (server dosen't store session state)<br>

# Common HTTP Methods
GET - Read data - /api/users - Get all users<br>
POST - Create Data - /api/users - Create a new user<br>
PUT - Update entire data - /api/users/1 - Replace user with ID = 1<br>
PATCH - Update Partial - /api/users/1 - Update part of user with ID = 1<br>
DELETE - Delete data - /api/users/1 - Delete user with ID = 1<br>


<pre>
    Example<br>
    https://example.com/api/employees/123<br>
     
    https://example.com = domain (server)

    /api/employees/123 = resource (employee with ID 123)

    HTTP Method (GET, POST...) defines what you're doing with it.

</pre>

Think of REST like CRUD operations in a database, but instead of INSERT, SELECT, UPDATE, DELETE, you're using HTTP methods (POST, GET, PUT, DELETE) over the web.