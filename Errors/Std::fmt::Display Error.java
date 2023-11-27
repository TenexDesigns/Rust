    let data = [1, 2, 3, 4, 5];
      println!("{data}");
let slice: &[i32] = &data[2..4]; // Slice of two integers from the original array
  println!("{slice}");


Error ====   [{integer}; 5]` doesn't implement `std::fmt::Display`




-------------------------------------------------------------------------------------------------------------

The error you're encountering is because the array and slice types do not implement the `std::fmt::Display` trait, which is required for the `println!` macro when using the `{}` format specifier.

To print the array and slice, you can use the `{:?}` format specifier instead, which works with types that implement the `Debug` trait. Here's the corrected code:

```rust
fn main() {
    let data = [1, 2, 3, 4, 5];
    println!("{:?}", data); // Use {:?} for arrays
    let slice: &[i32] = &data[2..4];
    println!("{:?}", slice); // Use {:?} for slices
}
```

In this code, `{:?}` will print the array and slice in a format that is suitable for debugging. This is a common way to display these types. If you specifically want a different format, you might need to implement the `std::fmt::Display` trait for your types, but for quick debugging output, `{:?}` is often sufficient.

  
