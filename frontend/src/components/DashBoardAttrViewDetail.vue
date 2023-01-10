<template>

    <v-card outlined>
        <v-card-title>
            DashBoardAttr # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileId" v-model="item.fileId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileSize" v-model="item.fileSize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileName" v-model="item.fileName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="YnIndexed" v-model="item.ynIndexed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="YnUploaded" v-model="item.ynUploaded" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="VideoUrl" v-model="item.videoUrl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashBoardAttrViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashBoardAttrs/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

