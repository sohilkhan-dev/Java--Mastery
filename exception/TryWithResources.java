// Try-with-resources is used to automatically close resources after their use.

 //  -> Normal:
// Scanner sc = new Scanner(System.in);

// try {
//     // use sc
// } finally {
//     sc.close();
// }

//  -> Try-with-resources:

// try (Scanner sc = new Scanner(System.in)) {
//     // use sc
// }