use std::{fs::{File, self}, io::{Read, Write}, string}; 

struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn area(&self) -> u32 {
        self.width * self.height
    }

    fn perimeter(&self) -> u32 {
        (self.width * 2) + (self.height * 2)
    }
}

fn main() -> std::io::Result<()> {
    let one = Rectangle {
        width: 50,
        height: 60,
    };
    
    let mut foo: File = File::create("foo.txt")?;
    let mut foo2: File = File::create("foo2.txt")?;
    foo.write_all(b"0110110")?;
    foo.write(b"\nwhen the days");
    fs::copy("foo.txt", "foo2.txt");

    println!("File Contents:\n{}\nNumber of Bytes: {}", fs::read_to_string("foo2.txt").unwrap(), fs::read("foo2.txt").unwrap().len());
    Ok(())
}



