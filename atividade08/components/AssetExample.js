import { Text, View, StyleSheet, Image, TextInput } from 'react-native';

export default function AssetExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.titulo}> Minha Tela</Text>
      
      <TextInput
        style={styles.input}
        placeholder='Digite algo...'
      />

      <View style={styles.labels}>
        <Text style={styles.label}>Montanhas</Text>
        <Text style={styles.label}>Praias</Text>
        <Text style={styles.label}>Comidas</Text>
      </View>

      <View style={styles.logo}>
        <Image style={styles.logo} source={require('../assets/i1.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i2.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i3.jfif')}/>
      </View>

      <View style={styles.logo1}>
        <Image style={styles.logo} source={require('../assets/i4.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i5.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i6.jfif')}/>
      </View>

      <View style={styles.logo2}>
        <Image style={styles.logo} source={require('../assets/i7.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i8.jfif')}/>
        <Image style={styles.logo} source={require('../assets/i9.jfif')}/>
      </View>
  
     </View>
  );
}

const styles = StyleSheet.create({
  container: {
  },

  titulo: {    
    textAlign: 'center',
    fontWeight: 'bold',
    fontSize: 35,
    margin: 24,
    marginTop: 150,
  },

   input: {
    textAlign: 'center',
    fontWeight: 'bold',
    width: '80%',
    marginLeft: '10%',
    fontSize: 20,
    borderWidth: 1,
    borderRadius: 5,
    padding: 10,
 },

  labels: {
   flexDirection: 'row',
   justifyContent: 'space-between',
   margin: 30,
   marginBottom: 30,
   marginLeft: 500,
   marginRight: 500,
  },
  
  logo: {
    flexDirection: 'row',
    marginLeft: '35%',
    marginBottom: 30,
    height: 107,
    width: 107,
  },

  logo1: {
    flexDirection: 'row',
    marginLeft: '35%',
    marginBottom: 30,
    height: 107,  
    width: 107,
  },

  logo2: {
    flexDirection: 'row',
    marginLeft: '35%',
    marginBottom: 30,
    height: 107,  
    width: 107,
  },
  
});
