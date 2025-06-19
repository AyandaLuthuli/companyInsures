This Java program determines insurance eligibility based on user input. Here's a brief description:

-It prompts the user to enter their gender (m/f), marital status (m/u for married/unmarried), and age.

-The program checks eligibility based on these rules:

-Married individuals (status == 'm') are automatically eligible.

-Unmarried males (status == 'u' && gender == 'm') must be 30 or older.

-Unmarried females (status == 'u' && gender == 'f') must be 25 or older.

-If none of the conditions are met, the user is not eligible.

Key Features:
-Uses Scanner for user input.

-Simple if-else logic to check eligibility.

-Case-sensitive comparison (user must enter lowercase 'm', 'u', or 'f').
