Certainly! Here are some code samples demonstrating the use of integers in Rust:

### Declaring Integer Variables

```rust
fn main() {
    // Signed integers
    let a: i8 = -5;
    let b: i16 = 1000;
    let c: i32 = -200_000;
    let d: i64 = 1_000_000_000;

    // Unsigned integers
    let e: u8 = 42;
    let f: u16 = 5000;
    let g: u32 = 1_000_000;
    let h: u64 = 10_000_000_000;

    // Platform-dependent size
    let i: isize = -42;
    let j: usize = 42;

    println!("Signed Integers: {}, {}, {}, {}", a, b, c, d);
    println!("Unsigned Integers: {}, {}, {}, {}", e, f, g, h);
    println!("Platform-dependent Integers: {}, {}", i, j);
}
```

### Integer Literals

```rust
fn main() {
    let decimal = 98_222;
    let hex = 0xff;
    let octal = 0o77;
    let binary = 0b1111_0000;
    let byte = b'A';

    println!("Decimal: {}", decimal);
    println!("Hexadecimal: {}", hex);
    println!("Octal: {}", octal);
    println!("Binary: {}", binary);
    println!("Byte: {}", byte as char);
}
```

### Integer Overflow

```rust
fn main() {
    let max_u8 = std::u8::MAX;
    let overflowing_sum = max_u8.wrapping_add(1);

    println!("Max u8: {}", max_u8);
    println!("Overflowing Sum: {}", overflowing_sum);
}
```

### Handling Overflow with Checked Methods

```rust
fn main() {
    let max_u8 = std::u8::MAX;
    let checked_sum_result = max_u8.checked_add(1);

    match checked_sum_result {
        Some(sum) => println!("Checked Sum: {}", sum),
        None => println!("Overflow occurred!"),
    }
}
```

These examples cover declaring integers, using various literal forms, and handling overflow using different methods provided by the standard library.




  
