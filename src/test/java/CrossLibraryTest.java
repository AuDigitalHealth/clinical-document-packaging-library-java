import au.gov.nehta.vendorlibrary.clinicalpackage.core.SubmissionSet;
import org.junit.Test;

import static au.gov.nehta.vendorlibrary.clinicalpackage.util.PackagingUtility.*;

public class CrossLibraryTest {

    @Test
    public void test_missingAttachments() throws Exception {
        SubmissionSet pkg = extractPackage("src/test/resources/CrossLanguageTests/MissingAttachments.zip");
        verifyPackage(pkg, null);
    }

    @Test
    public void test_relativeApproverId() throws Exception {
        SubmissionSet pkg = extractPackage("src/test/resources/CrossLanguageTests/RelativeApproverId.zip");
        verifyPackage(pkg, null);
    }

    @Test
    public void test_SHA256References() throws Exception {
        SubmissionSet pkg = extractPackage("src/test/resources/CrossLanguageTests/SHA256References.zip");
        verifyPackage(pkg, null);
    }

    @Test
    public void test_validReferences() throws Exception {
        SubmissionSet pkg = extractPackage("src/test/resources/CrossLanguageTests/ValidReferences.zip");
        verifyPackage(pkg, null);
    }

}
