In Rust, the `mod` keyword and the `use` keyword serve different purposes.

The `mod` keyword declares a new module. When you say `mod front_of_house;` in your `main.rs` file, you're telling Rust to look for either a `front_of_house.rs` file or a `front_of_house` directory with a `mod.rs` file in it, and treat the contents as the `front_of_house` module.

The `use` keyword, on the other hand, brings a path into scope, allowing you to use it in a more convenient and concise way. When you say `use crate::front_of_house::hosting;`, you're telling Rust that you want to refer to the `hosting` module directly by its name, rather than its full path (`crate::front_of_house::hosting`).

So in your example:

```rust
// In src/front_of_house.rs
pub mod hosting {
    pub fn add_to_waitlist() {}
}

// In src/main.rs
mod front_of_house;

use crate::front_of_house::hosting;

fn main() {
    hosting::add_to_waitlist();
}
```

The `mod front_of_house;` line is loading the contents of the `front_of_house` module, and the `use crate::front_of_house::hosting;` line is creating a convenient alias to the `hosting` module so that you can use `hosting::add_to_waitlist();` instead of `crate::front_of_house::hosting::add_to_waitlist();`.

So, to answer your question, `mod front_of_house;` brings the whole `front_of_house` module into scope, and `use crate::front_of_house::hosting;` brings only the `hosting` module into scope in a more convenient way. This is similar to how you might import modules or packages in other languages.
