<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Poppins", sans-serif;
        }

        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            color: seagreen;
            text-align: center;
            height: 100vh;
            
            background-image: url("z2.jpg");
            background-position: center;
            background-size: cover;
           
            
        }
        img{
        height:100px;
        width:150px;
        margin-left:570px;
        top:50px;
        }

        .brand-name {
            color: black;
            font-size: 32px;
            margin-bottom: 20px;
            text-shadow: 1px 1px 5px rgba(0, 0, 0, 0.5);
            margin-left:600px;
            margin-top:10px;
            
        }

        .wrapper {
            background-color: rgba(255, 255, 255, 0.8);
            border: 3px solid black;
            border-radius: 10px;
            padding: 20px;
            width: 400px;
            height:400px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-left:600px;
            margin-top:10px;
           
        }

        .wrapper h1 {
            color: rgb(68, 187, 230);
            margin-bottom: 20px;
            
        }

        .input-form {
            margin-bottom: 20px;
        }

        .input-form label {
            display: block;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .input-form input {
            width: 100%;
            height: 40px;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .input-form input::placeholder {
            font-size: 14px;
        }

        .input-form button {
            width: 100%;
            height: 50px;
            background-color: rgb(68, 187, 230);
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .register-link {
            margin-top: 20px;
        }

        .register-link a {
            color: rgb(68, 187, 230);
            text-decoration: none;
        }
        .er{
        margin-left:40%;
        color:black;
        }
    </style>
</head>
<body>
<img src="logo.png">


    <h2 class="brand-name">Abith Courier Service</h2>
               
 <%
        ArrayList<String> ab = (ArrayList<String>) request.getAttribute("error");
        if (ab != null) {
            Iterator<String> itr = ab.iterator();
    %>
    <div class="er">
    <ul>
        <% while (itr.hasNext()) { %>
        <li><%= itr.next() %></li>
        <% } %>
    </ul></div>
    <% } %>
    <div class="wrapper">
        <form action="loginservlet" method="post">
            <h1>Login</h1>
            <div class="input-form">
                <label for="UserName">Enter the UserName:</label>
                <input type="text" name="name" id="UserName" placeholder="UserName" required>
            </div>
            <div class="input-form">
                <label for="Password">Enter the Password:</label>
                <input type="password" name="password" id="Password" placeholder="Password" required>
            </div>
            <div class="input-form">
                <button type="submit" value="button">Login</button>
            </div>
            <div class="register-link">
                <p>Don't have an account? <a href='registerservlet'>Register</a></p>
            </div>
        </form>
    </div>
</body>
</html>
