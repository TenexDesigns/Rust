In Rust, integer types are used to store whole numbers. The integer types in Rust are categorized into signed and unsigned, and they have an explicit size. Signed integers can be negative or positive, while unsigned integers can only be positive. The size of an integer type determines the range of values it can store. For instance, an `i32` type can store values from -2,147,483,648 to 2,147,483,647.

Here is an example of how to declare an integer variable in Rust:

```rust
let number: i32 = 200;
```

In this example, `number` is a variable of type `i32` and it is assigned the value 200 [Source 0](https://www.programiz.com/rust/data-types).

Rust also allows you to write integer literals in various forms. For example:

- Decimal: `98_222`
- Hexadecimal: `0xff`
- Octal: `0o77`
- Binary: `0b1111_0000`
- Byte (u8 only): `b'A'`

These literals can be used to assign values to integer variables [Source 1](https://doc.rust-lang.org/book/ch03-02-data-types.html).

Integer overflow is a situation where the result of a mathematical operation exceeds the maximum value that can be represented by a given data type. For example, if you have a variable of type `u8` that can hold values between 0 and 255, and you try to assign it a value of 256, integer overflow will occur.

When you're compiling in debug mode, Rust includes checks for integer overflow that cause your program to panic at runtime. However, when you're compiling in release mode, Rust does not include checks for integer overflow that cause panics. Instead, if overflow occurs, Rust performs two's complement wrapping, which means that values greater than the maximum value the type can hold "wrap around" to the minimum of the values the type can hold [Source 1](https://doc.rust-lang.org/book/ch03-02-data-types.html).

To explicitly handle the possibility of overflow, you can use the following methods provided by the standard library for primitive numeric types:

- Wrap in all modes with the `wrapping_*` methods, such as `wrapping_add`.
- Return the `None` value if there is overflow with the `checked_*` methods.
- Return the value and a boolean indicating whether there was overflow with the `overflowing_*` methods.
- Saturate at the value’s minimum or maximum values with the `saturating_*` methods [Source 1](https://doc.rust-lang.org/book/ch03-02-data-types.html).

Here is an example of how to handle integer overflow in Rust:

```rust
fn main() {
   let mut x: u8 = 255;
   x = x.checked_add(1).unwrap_or(0);
   println!("{}", x); // prints: 0
}
```

In this example, the `checked_add` method is used to add 1 to `x`. If the addition results in an overflow, the method returns `None`. The `unwrap_or` method is then used to provide a default value of 0 in case of an overflow [Source 21](https://dev.to/guiszk/integer-overflow-in-c-and-rust-1dja).
                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                             
  ....
