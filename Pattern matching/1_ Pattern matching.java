Pattern matching in Rust is a powerful feature that allows you to destructure and match values against a set of patterns. It is often used in conjunction with enums, structs, and other types to handle different cases or conditions in a concise and expressive way. There are several ways to perform pattern matching in Rust:

### 1. **`match` Expression:**
The `match` expression is one of the most common ways to perform pattern matching in Rust. It allows you to compare a value against a set of patterns and execute corresponding code based on the match:

```rust
fn main() {
    let number = 42;

    match number {
        0 => println!("Zero"),
        1 | 2 => println!("One or Two"),
        3..=9 => println!("Three to Nine"),
        n if n % 2 == 0 => println!("Even number"),
        _ => println!("Some other number"),
    }
}
```

In this example, the `match` expression compares the value of `number` against different patterns, including specific values, ranges, and a catch-all `_` pattern.

### 2. **`if let` Expression:**
The `if let` expression is a concise way to perform pattern matching when you are interested in only one pattern:

```rust
fn main() {
    let some_value = Some(42);

    if let Some(number) = some_value {
        println!("Found a value: {}", number);
    } else {
        println!("No value found");
    }
}
```

Here, `if let` is used to match the `Some` variant of an `Option` type and extract the inner value.

### 3. **`while let` Loop:**
Similar to `if let`, the `while let` loop allows you to repeatedly perform pattern matching until a pattern doesn't match:

```rust
fn main() {
    let mut stack = vec![1, 2, 3];

    while let Some(top) = stack.pop() {
        println!("Popped: {}", top);
    }
}
```

In this example, the `while let` loop pops elements from a stack until it is empty.

### 4. **Pattern Matching with Enums:**
Enums in Rust are often used with pattern matching to represent different states or variants:

```rust
enum Coin {
    Penny,
    Nickel,
    Dime,
    Quarter,
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => 1,
        Coin::Nickel => 5,
        Coin::Dime => 10,
        Coin::Quarter => 25,
    }
}

fn main() {
    let penny = Coin::Penny;
    let value = value_in_cents(penny);
    println!("Value of Penny: {} cents", value);
}
```

In this example, the `Coin` enum is matched against different variants in the `value_in_cents` function.

### 5. **Struct Destructuring:**
Pattern matching can also be used to destructure structs:

```rust
struct Point {
    x: i32,
    y: i32,
}

fn main() {
    let origin = Point { x: 0, y: 0 };

    match origin {
        Point { x, y } => println!("Origin at ({}, {})", x, y),
    }
}
```

Here, the `Point` struct is destructured to access its `x` and `y` fields within the `match` expression.

Pattern matching in Rust is a versatile and expressive tool that allows you to handle different cases in a clear and concise manner. It is widely used for tasks such as error handling, state management, and deconstructing complex data structures.





  ....
