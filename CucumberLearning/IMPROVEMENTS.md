# CucumberProjects Improvements

## Summary of Changes

This repository has been improved with the following enhancements:

### 1. Dependency Management
- **Fixed duplicate Selenium dependency**: Removed duplicate `selenium-java` dependency (version 4.12.1) and kept the newer version (4.18.1)
- **Eliminated build warnings**: No more Maven warnings about duplicate dependencies

### 2. Test Runner Configuration
- **Enabled test execution**: Changed `dryRun = false` to allow actual test execution instead of just validation
- **Added HTML reporting**: Configured Cucumber to generate HTML reports in `target/cucumber-reports`
- **All feature files**: Runner now executes all feature files in the `featureFiles` directory

### 3. Browser Configuration
- **Headless Chrome support**: Created `DriverManager` utility class for consistent browser configuration
- **CI/CD ready**: Chrome runs in headless mode with appropriate flags for CI environments
- **Cross-platform compatibility**: Added necessary Chrome options for stability

### 4. Project Organization
- **Added .gitignore**: Properly excludes build artifacts and IDE files from version control
- **Utility classes**: Created reusable `DriverManager` for consistent WebDriver setup

## Available Test Features

The project includes several test scenarios:

1. **Google Search Test** (`openGoogle.feature`): Basic search functionality
2. **OrangeHRM Login Tests**: Multiple variations of login scenarios
   - Basic login (`LoginFeature.feature`)
   - Login with data (`LoginwithData.feature`) 
   - Data table examples (`DataTableWithExamples.feature`)
3. **Regular Expressions** (`expressions.feature`): Cucumber expression examples

## Running Tests

To execute all tests:
```bash
mvn test
```

To run specific feature:
```bash
mvn test -Dcucumber.options="src/test/resources/featureFiles/openGoogle.feature"
```

## Reports

After test execution, HTML reports are available at:
`target/cucumber-reports/index.html`