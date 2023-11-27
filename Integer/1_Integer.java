Sure, here's an overview of integers in Rust with code samples:

**Integers**

Integers are whole numbers without a fractional component. They can be positive, negative, or zero. Rust provides various integer types to represent different ranges of values:

- **Signed Integers (i8, i16, i32, i64, i128)**: These types can store both positive and negative numbers. The size of the type determines the range of values it can hold. For instance, an `i8` can store values from -128 to 127, and an `i32` can store values from -2147483648 to 2147483647.

**Example:**

```rust
let age: i32 = 30; // Signed integer variable
let temperature: i16 = 22; // Signed integer variable
```

- **Unsigned Integers (u8, u16, u32, u64, u128)**: These types can only store positive numbers, including zero. They have the same size limitations as their signed counterparts.

**Example:**

```rust
let count: u8 = 10; // Unsigned integer variable
let score: u32 = 98; // Unsigned integer variable
```

**Integer Literals**

Integer literals can be written in various forms:

- **Decimal:** Represent numbers in the standard base-10 format.

**Example:**

```rust
let number1: i32 = 100;
let number2: u16 = 500;
```

- **Hexadecimal:** Represent numbers in base-16, prefixed with `0x`.

**Example:**

```rust
let hex_number1: i8 = 0xFF;
let hex_number2: u32 = 0xABCD;
```

- **Octal:** Represent numbers in base-8, prefixed with `0o`.

**Example:**

```rust
let octal_number1: i8 = 077;
let octal_number2: u32 = 0o755;
```

- **Binary:** Represent numbers in base-2, prefixed with `0b`.

**Example:**

```rust
let binary_number1: i16 = 0b101010;
let binary_number2: u64 = 0b11111111_11111111_11111111_11111111;
```

- **Underscores:** Underscores can be used to improve readability of long integer literals.

**Example:**

```rust
let large_number: i64 = 1_000_000_000;
```

**Integer Operations**

Rust supports various operations on integers, including:

- **Arithmetic operations:** Addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).

**Example:**

```rust
let sum = 10 + 20; // sum = 30
let difference = 50 - 30; // difference = 20
let product = 8 * 6; // product = 48
let quotient = 12 / 4; // quotient = 3
```

- **Comparison operations:** Equal to (`==`), not equal to (`!=`), greater than (`>`), greater than or equal to (`>=`), less than (`<`), and less than or equal to (`<=`).

**Example:**

```rust
let x = 10;
let y = 20;

if x == y {
    println!("x and y are equal");
} else if x > y {
    println!("x is greater than y");
} else {
    println!("x is less than y");
}
```

- **Bitwise operations:** AND (`&`), OR (`|`), XOR (`^`), and NOT (`!`).

**Example:**

```rust
let a = 10; // 1010 in binary
let b = 5; // 0101 in binary

let and_result = a & b; // 0000 in binary
let or_result = a | b; // 1111 in binary
let xor_result = a ^ b; // 1011 in binary
let not_result = !a; // 1101 in binary
```

Remember to choose the appropriate integer type for your data based on the range of values it











  
