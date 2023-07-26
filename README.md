
# Producer-Consumer Problem


The Producer-Consumer problem is a classical multi-process synchronization problem, that is we are trying to achieve synchronization between more than one process.

There is one Producer in the producer-consumer problem, Producer is producing some items, whereas there is one Consumer that is consuming the items produced by the Producer. The same memory buffer is shared by both producers and consumers which is of fixed-size.

The task of the Producer is to produce the item, put it into the memory buffer, and again start producing items. Whereas the task of the Consumer is to consume the item from the memory buffer.

![Single PS](https://www.baeldung.com/wp-content/uploads/2022/02/Producer-Consumer1.png)

Inherently, this problem has certain complexities to deal with:

- Both producer and consumer may try to update the queue at the same time. This could lead to data loss or inconsistencies.
- Producers might be slower than consumers. In such cases, the consumer would process elements fast and wait.
- In some cases, the consumer can be slower than a producer. This situation leads to a queue overflow issue.
- In real scenarios, we may have multiple producers, multiple consumers, or both. This may cause the same message to be processed by different consumers.
  The diagram below depicts a case with multiple producers and multiple consumers:
  ![Multi PS](https://www.baeldung.com/wp-content/uploads/2022/02/Multi-Producers-Multi-Consumers.png)

We need to handle resource sharing and synchronization to solve a few complexities:

Synchronization on queue while adding and removing data
On queue empty, the consumer has to wait until the producer adds new data to the queue
When the queue is full, the producer has to wait until the consumer consumes data and the queue has some empty buffer


## Appendix

- [Usage in OS](https://www.javatpoint.com/producer-consumer-problem-in-os)
- [WiKi](https://en.wikipedia.org/wiki/Producer%E2%80%93consumer_problem)

