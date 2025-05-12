    <template>
        HomePage
        <RouterLink to="/sobre">Sobre</RouterLink>
        <ListaPromocoes />
    </template>
    <script>
    import { RouterLink } from 'vue-router'
    import ListaPromocoes from '../components/ListaPromocoes.vue'
    export default {
        name: 'HomePage',
        components: {
            RouterLink,
            ListaPromocoes
        }
    }
</script>