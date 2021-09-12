### save user
```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... save user
Host: localhost:8080
Content-Type: application/json
Content-Length: 74

{
    "name":"user1",
    "username":"user1",
    "password":"user1"
}
```

### make admin
```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1245!
```

### sign up
```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 77

{
    "name":"admin",
    "username":"admin",
    "password":"password"
}
```
### sign-in
```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 53

{
    "username":"user1",
    "password":"user1"
}
```

### save-book
```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 118

{
    "title":"Test Book 2",
    "price":10,
    "description":"Test Description",
    "author":"Test autho 2r"
}
```

### Delete book
```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin 
```

### Get All Books
```
GET /api/book HTTP/1.1
Host: localhost:8080
```

### Save Purchase
```
POST /api/purchase-history/ HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin 
Content-Type: application/json
Content-Length: 54

{
    "userId":3,
    "bookId":1,
    "price":10
}
```

### Get User Purchases
```
GET /api/purchase-history/ HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
```