In Rust, there are several ways to display structs and other data types without using macros. Here are a few methods:

1. **Using the `fmt::Debug` trait**: This trait provides the `Debug` formatting, which allows you to print out structs for easier debugging. You can use the `{:?}` formatter with `println!` to print the entire struct. You need to derive the `Debug` trait for your struct to use this method. Here is an example:

   ```rust
   #[derive(Debug)]
   struct Cat {
       name: String,
       age: u8
   }
   
   fn main() {
       let catname = String::from("Scratchy");
       let scratchy = Cat{ name: catname, age: 4 };
       println!("{:?}", scratchy);
   }
   ```
   In this example, the `Cat` struct is derived from the `Debug` trait, and then an instance of `Cat` is created and printed using `{:?}` [Source 2](https://blog.logrocket.com/fundamentals-for-using-structs-in-rust/).

2. **Using the `itertools` crate**: This crate provides the `join` method, which combines all iterator elements into one `String`, separated by a specified separator. This can be used to display collections of data in a struct. Here is an example:

   ```rust
   use itertools::Itertools;
   
   struct Point2D {
       x: i32,
       y: i32,
   }
   
   impl Display for Point2D {
       fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
           write!(f, "({}, {})", self.x, self.y)
       }
   }
   ```
   In this example, the `Point2D` struct implements the `Display` trait. The `fmt` method formats the struct into a string that can be printed [Source 0](https://stackoverflow.com/questions/75251994/is-there-a-nicer-way-to-implement-display-for-structs-that-own-collections-of-th).

3. **Using the `derive_more` crate**: This crate provides the `Display` derive macro, which can be used to automatically implement the `Display` trait for your struct. Here is an example:

   ```rust
   #[derive(Display)]
   #[display(fmt = "({}, {})", x, y)]
   struct Point2D {
       x: i32,
       y: i32,
   }
   ```
   In this example, the `Point2D` struct is derived from the `Display` trait, and then an instance of `Point2D` is created and displayed [Source 0](https://stackoverflow.com/questions/75251994/is-there-a-nicer-way-to-implement-display-for-structs-that-own-collections-of-th).

4. **Using the `format!` macro**: This macro returns a `String` and can be used to format data into a string. This can be used to display data in a struct. Here is an example:

   ```rust
   struct Point2D {
       x: i32,
       y: i32,
   }
   
   let point = Point2D { x: 1, y: 2 };
   let point_str = format!("({}, {})", point.x, point.y);
   println!("{}", point_str);
   ```
   In this example, the `Point2D` struct is used to create a `String` using the `format!` macro, and then the `String` is printed [Source 6](https://www.programiz.com/rust/struct).

Remember that in Rust, each property in the struct must be a type. Be sure to consider the difference between a string (a string object or struct) and `&str` (a pointer to a string) [Source 2](https://blog.logrocket.com/fundamentals-for-using-structs-in-rust/).



     .....
