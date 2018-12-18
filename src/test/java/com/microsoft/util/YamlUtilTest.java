package com.microsoft.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.microsoft.model.MetadataFile;
import com.microsoft.model.MetadataFileItem;
import com.microsoft.model.TypeParameter;
import org.junit.Test;

public class YamlUtilTest {

    @Test
    public void objectToYamlString() {
        MetadataFile metadataFile = new MetadataFile();
        metadataFile.getItems().add(buildMetadataFileItem(3));
        metadataFile.getReferences().add(buildMetadataFileItem(5));

        String result = YamlUtil.objectToYamlString(metadataFile);

        assertThat("Wrong result", result, is(""
            + "items:\n"
            + "- uid: Some uid 3\n"
            + "  id: Some id3\n"
            + "  href: Some href3\n"
            + "  parameters:\n"
            + "  - id: Some id 3\n"
            + "    type: Some type 3\n"
            + "references:\n"
            + "- uid: Some uid 5\n"
            + "  id: Some id5\n"
            + "  href: Some href5\n"
            + "  parameters:\n"
            + "  - id: Some id 5\n"
            + "    type: Some type 5\n"));
    }

    private MetadataFileItem buildMetadataFileItem(int seed) {
        MetadataFileItem metadataFileItem = new MetadataFileItem();
        metadataFileItem.setUid("Some uid " + seed);
        metadataFileItem.setId("Some id" + seed);
        metadataFileItem.setHref("Some href" + seed);
        metadataFileItem.getParameters().add(new TypeParameter.Builder()
            .addId("Some id " + seed).addType("Some type " + seed).build());

        return metadataFileItem;
    }
}