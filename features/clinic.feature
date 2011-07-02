Feature: Manage Clinics
    In order to manage Clinics
    As a user
    I want to add, edit, delete or view Clinics

    Scenario: Create a new Clinic
        Given that I am at first page
        And I hit "New"
        And I fill in "Name" with "Clínica São Pedro"
        And I fill in "Address" with "Av. Pontes Vieira"
        And I hit "Save"
        Then I should be at the first page again
        And I should see "Clínica São Pedro"
        And I should see "Av. Pontes Vieira"
