#tentando porem sem sucesso

def __init__(self):
    self.fila = []
    
def adicionar(self,clientes):
    self.fila.append(clientes)
    print("clientes {clientes}  adicionado a fila.") 

def primeiro(self):
    if self.fila:
        return self.fila[0]
    else:
        return "a fila esta vazia."
    
def ultimo(self):
    if self.fila:
        return self.fila[-1]
    else:
        return "a fila esta vazia"
    
def tamanho(self):
    return len(self.fila)

def remover(self):
    if self.fila:
        removindo = self.fila.pop(0)
        print(f"clientes {removido} removido da fila." ) 
    else:
        print("a fila esta vazia. Nada para remover.")

fila_atendimento = fila()

fila_atendimenoto.adicionar("clientes 1")
fila_atendimenoto.adicionar("clientes 2")
fila_atendimento.adicionar("cliente 3")
print(f"primeiro da fila: {fila_atendimento.primeiro()} ")
print(f'ultimo na fila: {fila_atendimento.ultimo()} ')
#verificando o tamanho da fila
print(f"numero de clients na fila: {fila_atendimento.tamanho()} ")

fila_atendimento.removido()
#verificando novamente o anadamento da fila
print(f"primeiro da fila: {fila_atimento.primeito()}")
print(f"numero de clientes na fila: {fila_atendimento.tamanho()}")
          
                    