# 🏧 ATM Machine — Java Console App

> *Because who needs a real bank when you have a terminal?*

---

## 💰 What is this?

A fully functional **ATM simulation** built in Java! Log in with your customer number and PIN, then manage your checking and savings accounts — all from the comfort of your command line. No fees. No long queues. No judgmental tellers.

---

## ✨ Features

- 🔐 **Secure Login** — Customer number + PIN authentication
- 🏦 **Two Account Types** — Checking & Savings
- 👀 **View Balance** — See exactly how broke you are (formatted in $ too!)
- 💸 **Withdraw Funds** — Take your money and run
- 💵 **Deposit Funds** — Put it back where it belongs
- 🚫 **Overdraft Protection** — Balance can't go negative (we're responsible like that)

---

## 🚀 How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/Daria-D3/ATM-Machine.git
   ```

2. **Open in Eclipse** (or any Java IDE)

3. **Run** `ATM.java` as a Java Application

4. **Login with test credentials:**
   | Customer Number | PIN  |
   |----------------|------|
   | 9876543        | 9876 |
   | 8989898        | 1890 |

---

## 🗂️ Project Structure

```
ATM-Machine/
│
├── package1/
│   ├── ATM.java          # 🚀 Entry point — fires everything up
│   ├── Account.java      # 💳 Core banking logic (balances, deposits, withdrawals)
│   └── OptionMenu.java   # 📋 Login + all menu navigation
```

---

## 🎮 How It Works

```
Welcome to the ATM Project!
Enter your customer number: 9876543
Enter your pin number: 9876

Select the account you want to access:
Type 1 - Checking account
Type 2 - Saving account
Type 3 - Exit
```

Pick your account, then:
- Check your balance 💰
- Withdraw some cash 💸
- Make a deposit 🏦
- Or just leave 👋

---

## 🛠️ Built With

- **Java** ☕
- **Scanner** — for user input
- **HashMap** — for storing credentials
- **DecimalFormat** — so your money looks pretty (`$1,234.56`)
- **Eclipse IDE** — where the magic happened

---



## 📌 Notes

> ⚠️ This is a learning project. Please don't try to use it to actually withdraw money. It won't work. I've tried :(

