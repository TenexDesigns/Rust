In Rust, there are multiple ways to display structs and other data types, and using macros is just one of them. Let's explore a few options:

### 1. Debug Formatting with `#[derive(Debug)]`

Rust provides a convenient way to automatically derive the `Debug` trait for a struct, which enables printing the struct using the `println!("{:?}", my_struct)` syntax. This is achieved by adding `#[derive(Debug)]` above the struct definition.

Example:

```rust
#[derive(Debug)]
struct MyStruct {
    field1: i32,
    field2: String,
}

fn main() {
    let my_instance = MyStruct {
        field1: 42,
        field2: String::from("Hello, Rust!"),
    };

    println!("{:?}", my_instance);
}
```

### 2. Implementing `Display` Trait

The `Display` trait allows for more controlled and customized formatting. You need to manually implement this trait for your struct and then use the `write!` macro or `println!("{}", my_struct)`.

Example:

```rust
use std::fmt;

struct MyStruct {
    field1: i32,
    field2: String,
}

impl fmt::Display for MyStruct {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Field1: {}, Field2: {}", self.field1, self.field2)
    }
}

fn main() {
    let my_instance = MyStruct {
        field1: 42,
        field2: String::from("Hello, Rust!"),
    };

    println!("{}", my_instance);
}
```

### 3. Custom Formatting Functions

You can define your own functions to format and display the data types based on your specific requirements.

Example:

```rust
struct MyStruct {
    field1: i32,
    field2: String,
}

fn format_my_struct(my_struct: &MyStruct) -> String {
    format!("Field1: {}, Field2: {}", my_struct.field1, my_struct.field2)
}

fn main() {
    let my_instance = MyStruct {
        field1: 42,
        field2: String::from("Hello, Rust!"),
    };

    println!("{}", format_my_struct(&my_instance));
}
```

### 4. Pretty Printing with External Crates

External crates like `pretty_assertions` provide macros and functions for pretty-printing data structures. These can be useful for debugging and testing.

Example:

```rust
#[macro_use]
extern crate pretty_assertions;

struct MyStruct {
    field1: i32,
    field2: String,
}

fn main() {
    let expected = MyStruct {
        field1: 42,
        field2: String::from("Hello, Rust!"),
    };

    let actual = MyStruct {
        field1: 42,
        field2: String::from("Hello, Rust!"),
    };

    assert_eq!(expected, actual);
}
```

### Conclusion

While macros can be powerful for generating code, Rust provides flexibility through traits (like `Debug` and `Display`) and functions for custom formatting. The choice depends on the use case and the desired level of control over the formatting.
