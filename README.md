# Rizor E-Commerce Backend

A scalable RESTful backend API for the **Rizor** clothing brand e-commerce platform. Built with **Node.js**, **Express.js**, and **MongoDB**, this backend powers product management, authentication, orders, payments, and customer accounts for a modern online fashion store.

## 🚀 Features

- 🔐 JWT Authentication & Authorization
- 👤 Customer Account Management
- 🛍️ Product Management
- 👕 Clothing Categories & Collections
- 📦 Inventory & Stock Management
- 🛒 Shopping Cart API
- ❤️ Wishlist Management
- 📋 Order Processing
- 💳 Payment Gateway Integration
- 🚚 Shipping Address Management
- ⭐ Product Reviews & Ratings
- 🎟️ Coupon & Discount Support
- 📊 Admin Dashboard APIs
- 📁 Image Upload Support
- 🔍 Search, Filter & Pagination
- 📝 Input Validation & Error Handling
- 📈 Secure RESTful API Design

---

## 🛠️ Tech Stack

- Node.js
- Express.js
- MongoDB
- Mongoose
- JWT (JSON Web Token)
- bcrypt
- Multer
- Cloudinary (Optional)
- dotenv
- CORS
- Cookie Parser
- Express Validator

---

## 📂 Project Structure

```text
rizor-ecommerce-backend/
│
├── src/
│   ├── config/
│   ├── controllers/
│   ├── middleware/
│   ├── models/
│   ├── routes/
│   ├── services/
│   ├── utils/
│   ├── validations/
│   ├── app.js
│   └── server.js
│
├── uploads/
├── .env
├── package.json
└── README.md
```

---

## 📦 Installation

Clone the repository:

```bash
git clone https://github.com/your-username/rizor-ecommerce-backend.git
```

Move into the project directory:

```bash
cd rizor-ecommerce-backend
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm run dev
```

The server will start on:

```text
http://localhost:5000
```

---

## 🔧 Environment Variables

Create a `.env` file in the project root.

```env
PORT=5000

MONGODB_URI=mongodb://localhost:27017/rizor

JWT_SECRET=your_jwt_secret

JWT_EXPIRES_IN=7d

CLIENT_URL=http://localhost:5173

CLOUDINARY_CLOUD_NAME=your_cloud_name
CLOUDINARY_API_KEY=your_api_key
CLOUDINARY_API_SECRET=your_api_secret

STRIPE_SECRET_KEY=your_stripe_secret_key
```

---

## 📌 API Modules

### Authentication

- Register
- Login
- Logout
- Refresh Token
- Change Password
- Forgot Password
- Reset Password

### Products

- Get All Products
- Get Product Details
- Create Product
- Update Product
- Delete Product
- Search Products
- Filter by Category
- Filter by Size
- Filter by Color
- Filter by Price

### Categories

- Create Category
- Get Categories
- Update Category
- Delete Category

### Orders

- Create Order
- Get User Orders
- Get All Orders
- Update Order Status
- Cancel Order

### Cart

- Add to Cart
- Update Quantity
- Remove Item
- Clear Cart

### Wishlist

- Add Item
- Remove Item
- Get Wishlist

### Reviews

- Add Review
- Update Review
- Delete Review
- Get Product Reviews

### Admin

- Dashboard Statistics
- Manage Products
- Manage Users
- Manage Orders
- Inventory Reports

---

## 🔒 Authentication

Protected routes require a JWT access token.

Example:

```http
Authorization: Bearer <your_access_token>
```

---

## 📦 Scripts

```bash
# Development
npm run dev

# Production
npm start

# Lint
npm run lint
```

---

## 🧪 API Testing

Use any API testing tool such as:

- Postman
- Insomnia
- Thunder Client

---

## 🤝 Contributing

1. Fork the repository

2. Create a new branch

```bash
git checkout -b feature/new-feature
```

3. Commit your changes

```bash
git commit -m "Add new feature"
```

4. Push your branch

```bash
git push origin feature/new-feature
```

5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Mohammad Hasibul Hasan**

Backend Developer

---

Built with ❤️ for the **Rizor** clothing brand.
