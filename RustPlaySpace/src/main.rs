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

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };
    println!("The area of the rectangle is {} square pixels.",rect1.area());
    println!("The perimeter of the rectangle is {} pixels.",rect1.perimeter());
    add_two(rect1.width.try_into().unwrap(), rect1.height.try_into().unwrap());
}

fn add_two(one: i64, two: i64) {
    let total = one + two;
    println!("{}", total);
}

fn subtract_two(one:i64, two:i64) {
    let total:i64=one-two;
    println!("{}", total);
}
