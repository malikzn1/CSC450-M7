#include <iostream>
#include <thread>
#include <chrono>

void CountUp() {
    for (int i = 1; i <= 20; ++i) {
        std::cout << "Count Up: " << i << std::endl;
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
    }
}

void CountDown() {
    for (int i = 20; i >= 0; --i) {
        std::cout << "Count Down: " << i << std::endl;
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
    }
}

int main() {
    // Create and start the first thread
    std::thread thread1(CountUp);
    thread1.join(); // Wait for thread1 to finish

    // Create and start the second thread
    std::thread thread2(CountDown);
    thread2.join(); // Wait for thread2 to finish

    std::cout << "Counting complete!" << std::endl;
    return 0;
}
