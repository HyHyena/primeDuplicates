This is a duplicate of prime numbers finder project.
To run this project make sure you have cloned this project, installed and launched Docker daemon, curl or postman/soapUI. 

Then run followings:

```docker build --tag duplicates .```

```sudo docker run -d -p your_free_port:8080 duplicates```

<h3>If you are using curl.</h3>

To see whether application is alive or not run this:

```curl http://localhost:your_free_port/simpleDuplicates/simpleNumbers/check```

You should see "You have reached prime numbers controller" in your console

To test this app run followings:

```curl  -H 'Content-Type: application/json' -d '[1, 2, 2, 3, 3]' http://localhost:your_free_port/simpleDuplicates/simpleNumbers/findDuplicates```

You should see {"2":2,"3":2} what indicates that application is running smoothly. Go try other numbers :)

<h3>If you are using postman</h3>

To see whether application is alive or not choose GET request type and in paste next line in url:

```http://localhost:your_free_port/simpleDuplicates/simpleNumbers/check```

You should see "You have reached prime numbers controller" in your console

To test this app you should choose POST request with JSON raw body and in url line paste this:

```http://localhost:your_free_port/simpleDuplicates/simpleNumbers/findDuplicates```

Paste in body this:

```[1,5,-9,12,-3,89,18,23,4,-6,14,-5,87,17,47,-73,39,49,56,71,3,0,-2,23,-8,45,63,71,5,29,-4,15,78,37,99,-66,44,94,65,73, 3, 3]```

You should see {"3": 3, "5": 2, "23": 2, "71": 2 } what indicates that application is running smoothly. Go try other numbers :)
