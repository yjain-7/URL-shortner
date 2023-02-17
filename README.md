# URL-shortner
A URL shortener is a simple tool that takes a long URL and generates a shortened version of it, which is easier to share and remember. In this article, we will be implementing a basic URL shortener using object-oriented programming (OOP) principles

1. Create a concrete class which implements a short URL interface class provided. It contains all the methods that can be used to create long URL to short URL mappings.<br />
2. Implement a method to take a long URL as input, generate a random 9 character short URL and return it. Also maintain this mapping using a hash map for quick retrieval.<br />
3. Implement a method to take a long URL and a custom short URL as input and register that mapping. <br />
4. Error handling to make sure each long URL maps to only one short URL and vice versa.<br />
5. Implement a method to lookup short URL for a given long URL, from the mapping created.<br />
6. Implement a method to delete the mapping based on a long URL.<br />
7. Implement a counter to keep track of the hit count for each long URL - which tells us how many times a particular long URL has been looked up.<br />
8. Test these methods using test cases.
