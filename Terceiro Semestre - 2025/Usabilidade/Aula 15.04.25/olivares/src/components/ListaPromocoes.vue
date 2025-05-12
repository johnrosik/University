<template>
    <div>
        <h2>Promoções</h2>
        aqui vai as promos
        <div class="container">
            <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3"></div>
        <CardProduto />
        <CardProduto />
    </div>
    </div>
</template>
<script>
import CardProduto from './CardProduto.vue'
export default {
    name: 'ListaPromocoes',
    components: {
        CardProduto
    },
}
</script>
<style>
.vermelho {
    background-color: red;
}
</style>