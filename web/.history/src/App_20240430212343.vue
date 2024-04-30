<template>
  <div>
    <div>Bot昵称：{{ bot_name }}</div>
    <div>Bot战力：{{ bot_rating }}</div>
  </div>
  <router-view/>
</template>

<script>

import { ref } from 'vue';

export default {
  name: "app",
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");

    return {
      bot_name,
      bot_rating
    }
  }
}
</script>

<style>
</style>
