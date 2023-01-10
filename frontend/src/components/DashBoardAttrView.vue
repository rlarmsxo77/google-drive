<template>

    <v-data-table
        :headers="headers"
        :items="dashBoardAttr"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DashBoardAttrView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "userId", value: "userId" },
                { text: "fileId", value: "fileId" },
                { text: "fileSize", value: "fileSize" },
                { text: "fileName", value: "fileName" },
                { text: "ynIndexed", value: "ynIndexed" },
                { text: "ynUploaded", value: "ynUploaded" },
                { text: "videoUrl", value: "videoUrl" },
            ],
            dashBoardAttr : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/dashBoardAttrs'))

            temp.data._embedded.dashBoardAttrs.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.dashBoardAttr = temp.data._embedded.dashBoardAttrs;
        },
        methods: {
        }
    }
</script>

