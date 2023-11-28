Floating-Point Types

  
Rust also has two primitive types for floating-point numbers, which are numbers with decimal points. Rust’s floating-point types are f32 and f64, which are 32 bits and 64 bits in size, respectively. The default type is f64 because on modern CPUs, it’s roughly the same speed as f32 but is capable of more precision. All floating-point types are signed.

Here’s an example that shows floating-point numbers in action:

Filename: src/main.rs

fn main() {
    let x = 2.0; // f64

    let y: f32 = 3.0; // f32
}
Floating-point numbers are represented according to the IEEE-754 standard. The f32 type is a single-precision float, and f64 has double precision.

  ----------------------


In Rust, floating-point numbers are represented using the `f32` and `f64` data types, which correspond to 32-bit and 64-bit floating-point precision, respectively. Here's an overview of these floating-point types:

### `f32` (32-bit Floating-Point):

- **Range:** Approximately ±3.40282347e+38 to ±1.17549435e-38.
- **Precision:** 6-9 significant decimal digits.
- **Suffix:** Floating-point literals with no suffix are inferred to be of type `f64`. To specify an `f32` literal, use the `f32` suffix.

Example:
```rust
let float32_var: f32 = 3.14;
```

### `f64` (64-bit Floating-Point):

- **Range:** Approximately ±1.7976931348623157e+308 to ±2.2250738585072014e-308.
- **Precision:** 15-17 significant decimal digits.
- **Suffix:** Floating-point literals with no suffix are inferred to be of type `f64`.

Example:
```rust
let float64_var = 3.141592653589793; // Type inferred as f64
```

Floating-point literals can be written in decimal form or using scientific notation (e.g., `1.23e-4`). Rust also supports hexadecimal floating-point literals for `f64` using the `0x` prefix.

Floating-point arithmetic in Rust adheres to the IEEE 754 standard, which defines the representation and behavior of floating-point numbers in computing systems.

### Example Usage:

```rust
fn main() {
    let pi_f32: f32 = 3.14159265358979323846;
    let pi_f64 = 3.14159265358979323846;

    println!("f32 Pi: {}", pi_f32);
    println!("f64 Pi: {}", pi_f64);

    // Floating-point arithmetic
    let result = pi_f64 * 2.0;
    println!("2 * f64 Pi: {}", result);
}
```

Floating-point types are commonly used for representing real numbers, such as measurements, scientific values, or any quantity requiring a fractional component. However, due to the nature of floating-point representation, developers should be aware of potential precision issues when dealing with certain values or operations. Rust's standard library provides methods for comparing floating-point numbers with a certain tolerance to account for precision errors.
  
